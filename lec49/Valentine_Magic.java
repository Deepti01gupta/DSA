package lec49;

import java.util.Arrays;

public class Valentine_Magic {

//	https://codeskiller.codingblocks.com/problems/281
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] boys= {2,11,3};
		int[] girls= {5,7,3,2};
		Arrays.sort(boys);
		Arrays.sort(girls);
//		System.out.println(valentine(boys,girls,0,0));
		
		int[][] dp=new int[boys.length][girls.length];
		for (int[] row : dp) {
			Arrays.fill(row, -1);
		}
		System.out.println(valentine2(boys,girls,0,0,dp));
	}
	
	public static int valentine2(int[] boys, int[] girls, int i, int j, int[][] dp) {
		if(i==boys.length) {
			return 0;
		}
		if(j==girls.length) {
			return (int) 1e9;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int sel=Math.abs(boys[i]-girls[j])+valentine2(boys,girls,i+1,j+1,dp);
		int rej=valentine2(boys,girls,i,j+1,dp);
		return dp[i][j]=Math.min(sel, rej);
	}
	
	public static int valentine(int[] boys, int[] girls, int i, int j) {
		if(i==boys.length) {
			return 0;
		}
		if(j==girls.length) {
			return 9999999;
		}
		int sel=Math.abs(boys[i]-girls[j])+valentine(boys,girls,i+1,j+1);
		int rej=valentine(boys,girls,i,j+1);
		return Math.min(sel, rej);
		
	}

}
