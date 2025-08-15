package lec10;

import java.util.Scanner;

public class Kadens_algo {
	
	 // https://leetcode.com/problems/maximum-subarray/description/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);;
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0; i<n; i++) {
			nums[i]=sc.nextInt();
		}
		int ans=max_sum2(nums);
		System.out.println(ans);
		sc.close();
	}
	
	public static int max_sum2(int nums[]) {
		int ans=0;
		int sum=0;
		for(int i=0; i<nums.length; i++) {
			sum+=nums[i];
			ans=Math.max(ans, sum);
			if(sum<0) {
				sum=0;
			}
		}
		return ans;
	}

}
