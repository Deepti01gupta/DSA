package lec10;

import java.util.Scanner;

public class Maximum_Subarray {
	
	// https://leetcode.com/problems/maximum-subarray/description/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);;
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0; i<n; i++) {
			nums[i]=sc.nextInt();
		}
		int ans=max_sum1(nums);
		System.out.println(ans);
		sc.close();
	}
	
	public static int max_sum1(int nums[]) {
		int ans=0;
		for(int i=0; i<nums.length; i++) {
			int sum=0;
			for(int j=i; j<nums.length; j++) {
				sum+=nums[j];
				ans=Math.max(ans, sum);
			}
		}
		return ans;
	}

}
