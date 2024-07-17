package tasks;
import java.util.*;
class program{
	 
	public static void main(String ar[]) {
		int arr[]= {7,1,8,5,4};
		int i=0;
		System.out.println("Reverse of an array is:");
		fun(arr,i);
	}
	public static void fun(int arr[],int i) {
		
		if(arr.length-1==i) {
			
		}
		else {
			
			fun(arr,i+1);
			
		}
		System.out.print(arr[i]+" ");
		
	}
}