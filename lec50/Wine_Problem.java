package lec50;

import java.util.*;

public class Wine_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wine= {2,3,5,1,4};
//		System.out.println(maximum_profit(wine,0,wine.length-1,1));
		
		
//		int[][] dp=new int[wine.length][wine.length];
//		for(int i=0; i<wine.length; i++) {
//			Arrays.fill(dp[i],-1);
//		}
//		System.out.println(top_down(wine,0,wine.length-1,1,dp));
		
		
		System.out.println(maximum_proofBU(wine));
	}
	
	public static int maximum_proofBU(int[] wine) {
		int n=wine.length;
		int[][] dp=new int[n][n];
		int year=n;
		
		for(int i=0; i<n; i++) {
			dp[i][i]=wine[i]*year;
		}
		
		year--;
		for(int gap=1; gap<n; gap++) {
			for(int j=gap; j<n; j++) {
				int i=j-gap;
				int fs = wine[i]*year + dp[i+1][j];
				int ls = wine[j]*year + dp[i][j-1];
				dp[i][j]=Math.max(fs, ls);
			}
			year--;
		}
		return dp[0][n-1];
	}
	
	
	public static int top_down(int[] wine , int i, int j, int year, int[][] dp) {
		if(i>j) {
			return 0;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int fs = wine[i]*year + top_down(wine,i+1,j,year+1,dp); 
		int ls = wine[j]*year + top_down(wine,i,j-1,year+1,dp);
		return dp[i][j]=Math.max(fs, ls);
	}
	
	
	public static int maximum_profit(int[] wine, int i, int j, int year) {
		if(i>j) {
			return 0;
		}
		int fs = wine[i]*year + maximum_profit(wine,i+1,j,year+1);
		int ls = wine[j]*year + maximum_profit(wine,i,j-1,year+1);
		return Math.max(fs, ls);
	}

}
