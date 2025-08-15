package lec9;

import java.util.Scanner;

public class Rain_water_trapping {

	// https://leetcode.com/problems/trapping-rain-water/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);;
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0; i<n; i++) {
			nums[i]=sc.nextInt();
		}
		int ans=trap(nums);
		System.out.println(ans);
		sc.close();
	}
	
	// tc : O(3N) and sc: O(2N)
	public static int trap(int[] nums) {
		int n=nums.length;
		int[] left=new int[n];
		left[0]=nums[0];
		for(int i=1; i<n; i++) {
			left[i]=Math.max(left[i-1],nums[i]);
		}
		int[] right=new int[n];
		right[n-1]=nums[n-1];
		for(int i=n-2; i>=0; i--) {
			right[i]=Math.max(right[i+1],nums[i]);
		}
		int ans=0;
		for(int i=0; i<n; i++) {
			int t=Math.min(left[i], right[i]);
			ans+=t-nums[i];
		}
		return ans;
	}

}
