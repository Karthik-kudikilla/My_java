package mycodes;

public class quick_sort {
	public static void main(String ar[]) {
		int arr[]= {12,4,3,8,0,69};
		qs(arr,0,arr.length-1);
		for(int i:arr) {
			System.out.println(i);
		}
}
	public static void qs(int arr[],int low,int high) {
		if(low<high) {
			int i=partition(arr,low,high);
			qs(arr,low,i-1);
			qs(arr,i+1,high);
		}
	}
	public static int partition(int arr[],int low,int high)
	{
		
		int pivot=arr[low];
		int i=low,j=high;
		while(i<j) {
		
			while(i<=high&&pivot>=arr[i]) {
				i++;
			
			}
			
			while(j>=low&&pivot<arr[j]) {
				j--;
				
			}
			if(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
	}
		int temp=arr[low];
		arr[low]=arr[j];
		arr[j]=temp;
		return j;
		}
		
		
}
