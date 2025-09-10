package lec49;

import java.util.*;

public class O_N_knapsack_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cap=4;
		int n=5;
		int[] wt= {1,2,3,2,2};
		int[] val= {8,4,0,5,3};
//		System.out.println(knapsack(wt,val,cap,0));
		
		int[][] dp=new int[n+1][cap+1];
		for (int[] row : dp) {
			Arrays.fill(row, -1);
		}
		System.out.println(knapsack2(wt, val, cap, 0, dp));
	}
	
	public static int knapsack2(int[] wt, int[] val, int cap, int i, int[][] dp) {
		if(cap==0 || i==wt.length) {
			return 0;
		}
		if(dp[i][cap]!=-1) {
			return dp[i][cap];
		}
		int inc=0, exc=0;
		if(cap>=wt[i]) {
			inc=val[i]+knapsack2(wt,val,cap-wt[i],i+1,dp);
		}
		exc=knapsack2(wt,val,cap,i+1,dp);
		return dp[i][cap]=Math.max(inc, exc);
	}
	
	public static int knapsack(int[] wt, int[] val, int cap, int i) {
		if(cap==0 || i==wt.length) {
			return 0;
		}
		int inc=0, exc=0;
		if(cap>=wt[i]) {
			inc=val[i]+knapsack(wt,val,cap-wt[i],i+1);
		}
		exc=knapsack(wt,val,cap,i+1);
		return Math.max(inc, exc);
	}

}
