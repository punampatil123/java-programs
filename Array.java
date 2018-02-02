class Array{
	public static void main(String args[]){
		int[] a={1,2,3};
		int[] b={5,2};
		
		System.out.println(commanEnd(a,b));
	}
	public static boolean commanEnd(int[] a,int[] b){
		int f1=a[0];
		int f2=b[0];
		int l1=a.length-1;
		int l2=b.length-1;
		
		
		if( f1==f2|| l1==l2)
			return true;
		else
			return false;
	}
}
























































































































