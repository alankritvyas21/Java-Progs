public class removedup{
    public static int remove_duplicate(int array[], int n){
        if(n==0 || n==1)
        {
            return n;
        }
        int[] A=new int[n];
        int b=0;
        for(int i=0;i<n-1;i++)
        {
            if(array[i]!=array[i+1])
            {
                A[b++]=array[i];
            }
        }
        A[b++]=array[n-1];
        for(int i=0;i<b;i++){
        array[i]=A[i];
        }
        return b;
        }
        public static void main (String[] args) {
        int array[]={1,1,2,3,4,4,4,5,6,7,7,8,9,0};
        int k=array.length;
        k=remove_duplicate(array,k);
        for(int i=0;i<k;i++)
        {
        System.out.print(array[i]+" ");
        }
    }
     
    }