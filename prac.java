class prac{
	public static void main(String ar[]) {
		int k=2,n=4;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=0;j<(2*n)-k;j++) {
				System.out.print(" ");
			}
			for(int j=i;j>0;j--) {
				System.out.print(j);
			}
			k=k2;
			System.out.println();
		}
		
		
	}
}