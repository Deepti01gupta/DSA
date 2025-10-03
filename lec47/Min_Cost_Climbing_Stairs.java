package lec47;

import java.util.Arrays;

public class Min_Cost_Climbing_Stairs {

	
//	https://leetcode.com/problems/min-cost-climbing-stairs/
	public int minCostClimbingStairs(int[] cost) {
		
//        return mincost1(cost);
		
//		return mincost2(cost);
		
		return mincostBU(cost);
    }
	
	
	public int mincostBU(int[] arr) {
		if(arr.length==1) {
			return arr[0];
		}
		int[] dp=new int[arr.length+1];
		Arrays.fill(dp,-1);
		for(int i=arr.length-1; i>=0; i--) {
			dp[i]=arr[i]+Math.min(dp[i+1], dp[i+2]);
		}
		return Math.min(dp[0],dp[1]);
	}
	
	
	public int mincost2(int[] arr) {
		int[] dp=new int[arr.length+1];
		Arrays.fill(dp,-1);
		int idx0=min2(arr,0,dp);
		int idx1=min2(arr,1,dp);
		return Math.min(idx0, idx1);
	}
	public int min2(int[] arr, int i, int[] dp) {
		if(i>=arr.length) {
			return 0;
		}
		if(dp[i]!=-1) {
			return dp[i];
		}
		int f=min2(arr,i+1,dp);
		int s=min2(arr,i+2,dp);
		return dp[i]=Math.min(f, s)+arr[i];
	}
	
	
	
	public int mincost(int[] arr) {
		int idx0=min1(arr,0);
		int idx1=min1(arr,1);
		return Math.min(idx0, idx1);
	}
	public int min1(int[] arr, int i) {
		if(i>=arr.length) {
			return 0;
		}
		int f=min1(arr,i+1);
		int s=min1(arr,i+2);
		return Math.min(f, s)+arr[i];
	}
	
}
 