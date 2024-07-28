package mycodes;

public class insertion_sort {
	public static void main(String ar[]) {
		int arr[]= {4,8,2,5,3};
		int n=arr.length;
		for(int i=1;i<n;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				else {
					break;
				}
			}
		}
		for(int i:arr) {
			System.out.println(i);
		}
}
}
