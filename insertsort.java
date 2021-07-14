class insertsort{ 
	void insert_sort(int array[])
	{ 
		int n=array.length; 
		for(int i=1;i<n;++i) { 
			int k=array[i]; 
			int j=i-1; 

			while(j>=0 && array[j]>k) { 
				array[j+1]=array[j]; 
				j=j-1; 
			} 
			array[j+1]=k; 
		} 
	} 
	static void array_print(int array[]) 
	{ 
		int n=array.length; 
		for(int i=0;i<n;++i) 
			System.out.println(array[i]+" "); 
		System.out.println(); 
	} 
	public static void main(String args[]) 
	{ 
		int array[] = {9,8,3,6,2,5,7,4,1,}; 
        insertsort ob1 = new insertsort(); 
		ob1.insert_sort(array); 
        array_print(array); 
	} 
}
