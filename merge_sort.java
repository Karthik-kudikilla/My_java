package mycodes;

import java.util.ArrayList;

public class merge_sort {
	public static void main(String ar[]) {
		int arr[]= {4,8,2,5,3};
		
		int low=0,high=arr.length-1;
		mergesort(arr,low,high);
		for(int i:arr) {
			System.out.println(i);
		}
}
public static void mergesort(int arr[],int low,int high) {
	if(low>=high)return;
	
	int mid=(low+high)/2;
	mergesort(arr,low,mid);
	mergesort(arr,mid+1,high);
	merge(arr,low,mid,high);
	
	
}
public static void merge(int arr[],int low,int mid,int high) {
	int start=low,end=mid+1;
	ArrayList<Integer>temp=new ArrayList<>();
	while(start<=mid&&end<=high) {
		if(arr[start]<=arr[end]) {
			temp.add(arr[start]);
			start++;
		}
		else {
			temp.add(arr[end]);
			end++;
		}
	}
	while(start<=mid) {
		temp.add(arr[start]);
		start++;
	}
	while(end<=high) {
		temp.add(arr[end]);
		end++;
	}
	for(int i=0;i<temp.size();i++) {
		arr[i+low]=temp.get(i);
		/*here we are taking i+low because for instance the merge function is working for merge(3,3,4)
		 * then if we write(arr[i]=temp[i] then arr[0] will get disturbed actually here arr[3] should be affected 		 */
	}
	
}

}
