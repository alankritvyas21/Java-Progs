public class dupstring {
    public static void main(String args[])
    {
        String array[]={"Alankrit","AV","Alan","AV","Amazon","Keplar","Alan","Orion","Keplar"};   
        System.out.println("The dulpicate elements in the array are: ");
        for(int i=0;i<array.length-1;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]==array[j] && (i!=j))
                { 
                    System.out.println(array[j]);
                }
            }
        }
          
    }
}
