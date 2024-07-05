class prac{
	public static void main(String ar[]) {
		int n=5,k=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<(n-i);j++) {
				System.out.print("*");
			}
			for(int j=0;j<k;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(n-i);j++) {
				System.out.print("*");
			}
			k+=2;
			System.out.println();
			
		}
		k-=2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=0;j<k;j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			k-=2;
			System.out.println();
		}
		
	}
}