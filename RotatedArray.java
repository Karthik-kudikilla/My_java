package tasks;
import java.util.*;
class RotatedArray{
	public static void main(String ar[]) {
		int nums[]= {4,5,6,7,0,1,2};
		int target=-1,key=0;
		int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target) {
            System.out.println(mid);
            key=1;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && nums[mid]>=target){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(nums[mid]<=target&&nums[high]>=target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        if(key==0) System.out.println("Not found");
	}
}