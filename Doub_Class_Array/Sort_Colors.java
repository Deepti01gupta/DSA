package Doub_Class_Array;

public class Sort_Colors {

//	https://leetcode.com/problems/sort-colors/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,0,2,1,1,0};

		sortColors(nums);
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
	}
	
	public static void sortColors(int[] nums) {
        int i=0;
        int right=nums.length-1;
        int left=0;
        while(i<right) {
        	if(nums[i]==0) {
        		int t=nums[left];
        		nums[left]=nums[i];
        		nums[i]=t;
        		left++;
        		i++;
        	}
        	else if(nums[i]==1) {
        		i++;
        	}
        	else {
        		int t=nums[right];
        		nums[right]=nums[i];
        		nums[i]=t;
        		right--;
        	}
        	
        }
    }

}
