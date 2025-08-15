package lec11;

import java.util.Scanner;

public class Binary_search {
	
	// binary search always work on a sorted search space
	// its time complexity is O(log N)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);;
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0; i<n; i++) {
			nums[i]=sc.nextInt();
		}
		int item=sc.nextInt();
		int ans=search(nums,item);
		System.out.println(ans);
		sc.close();
	}
	
	public static int search(int[] nums, int item) {
		int lo=0;
		int hi=nums.length-1;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(nums[mid]==item) {
				return mid;
			}
			else if(nums[mid]>item) {
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return lo;
	}

}
