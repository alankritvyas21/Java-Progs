class odd extends Thread
{
    int limit;
    print printer;
    public odd(int limit, print printer)
        {
            this.limit = limit;
            this.printer = printer;
        }
        @Override
        public void run() 
        {
            int oddNumber = 1;        
            while (oddNumber <= limit)
        {
            printer.printOdd(oddNumber);       
            oddNumber = oddNumber + 2;         
        }
    }
}

class even extends Thread
{
    int limit;
    print printer;
    public even(int limit, print printer)
    {
        this.limit = limit;
        this.printer = printer;
    }
    @Override
    public void run() 
    {
        int evenNumber = 2;           
        while (evenNumber <= limit)
    {
        printer.printEven(evenNumber);          
        evenNumber = evenNumber + 2;           
    }
    }
}
class print
{

boolean isOddPrinted = false;

synchronized void printOdd(int number)
    {
        while (isOddPrinted)
    {
        try
    {
        wait();
    } 
        catch (InterruptedException e)
    {
        e.printStackTrace();
    }
    }
        System.out.println(Thread.currentThread().getName()+": "+number);
        isOddPrinted = true;
        try
    {
        Thread.sleep(1000);
    } 
        catch (InterruptedException e) 
    {
        e.printStackTrace();
    }
        notify();
    }

synchronized void printEven(int number)
    {
        while (! isOddPrinted)
    {
        try
    {
        wait();
    }
        catch (InterruptedException e) 
    {
        e.printStackTrace();
    }
    }
        System.out.println(Thread.currentThread().getName()+": "+number);
        isOddPrinted = false;
    try
    {
        Thread.sleep(1000);
    } 
        catch (InterruptedException e) 
    {
        e.printStackTrace();
    }
        notify();
    }
    }

public class mult
{
    public static void main(String[] args) 
    {
        print printer = new print();
        odd odd = new odd(10, printer);
        odd.setName("Odd");
        even even = new even(10, printer);
        even.setName("Even");
        odd.start();
        even.start();
}
}