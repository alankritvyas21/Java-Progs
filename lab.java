import java.io.* ;
interface IntOperations
{
 public void pos_neg();
 public void eve_odd();
 public void isPrime();
 public void sumOfDigits();
}
class one implements IntOperations
{
 private int number ;
 one()
 {
  this.number=0 ;
 }
 one(int num)
 {
    this.number=num ;
 }
 public void pos_neg()
 {
  if(this.number<0)
   System.out.println("\nNumber Is Negetive...") ;
  else
   System.out.println("\nNumber Is Positive...") ;
 }
 public void eve_odd()
 {
  if(this.number%2==0)
   System.out.println("\nNumber Is Even...") ;
  else
   System.out.println("\nNumber Is Odd...") ;
 }
 public void isPrime()
 {
  int i = 2 ;
  while(i!=this.number)
  {
   if(this.number%i==0)
   {
    System.out.println("\nNumber Is Not Prime...") ;
    break ;
   }
   i++ ;
  }
  if(this.number==i)
   System.out.println("\nNumber Is Prime...") ;
 }
 public void sumOfDigits()
 {
  int sum=0;
  int i=this.number;
  while(i!=0)
  {
   sum+=(i%10);
   i=i/10;
  }
  System.out.println("\nSum Of The Digits Is : "+sum) ;
 }
}
public class Main{
 public static void main(String[] args) throws Exception 
 {
 
  int num=Integer.parseInt(args[0]) , choice ;
  one o=new one(num) ;
  BufferedReader b=new BufferedReader(new InputStreamReader(System.in)) ;
  while(true)
  {
   System.out.println("\n1.Positive or Negative") ;
   System.out.println("\n2.Even or Odd") ;
   System.out.println("\n3.Prime") ;
   System.out.println("\n4.Sum of digits") ;
   System.out.println("\n5.Exit") ;
   System.out.println("\nEnter your choice here : ") ;
   choice=Integer.parseInt(b.readLine()) ;
   switch(choice)
   {
    case 1:
      o.pos_neg() ;
      break ;
    
    case 2:
      o.eve_odd() ;
      break ;
    
    case 3:
      o.isPrime() ;
      break ;

    
    case 4:
      o.sumOfDigits() ;
      break ;
    
    case 5:
      System.exit(0) ;
      break ;
    
    default:
      System.out.println("Invalid choice.\nEnter again :") ;
      break ; 
   }
  }
 }
}