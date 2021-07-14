class Tri
{
    public static void main(String[] args)
    {
        int i,j,n,t;
        n=4;
        for(i=0;i<n;i++)
        {
            t=1;
            for(j=0;j<n+i;j++)
            {
               if(j<n-i-1)
                    System.out.print(" ");
                else
                {
                    System.out.print(t);
                    
                    
                    if(j<n-1)
                    {
                        t++;
                        
                    }    
                    else
                    {
                        t--;
                    }
                        
                }
            
            }

            System.out.println(" ");
        }
    }
 
}