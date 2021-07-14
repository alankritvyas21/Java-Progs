public class dupint {
    public static void main(String args[])
    {
        int array[]=new int[]{1,2,3,4,5,6,7,8,9,10,5,3,4,9};   
        System.out.println("The duplicate elements in the array are: ");
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]==array[j])
                { 
                    System.out.println(array[j]);
                }
            }
        }
          
    }
}
