 package lec49;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum {

//	https://leetcode.com/problems/minimum-falling-path-sum/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix= {{2,1,3},{6,5,4},{7,8,9}};
		int ans=Integer.MAX_VALUE;
//		for(int col=0; col<matrix[0].length; col++) {
//			ans=Math.min(ans, Minimum_Falling_Path(matrix,0,col));
//		}
		
		int[][] dp=new int[matrix.length][matrix[0].length];
		for (int[] row : dp) {
			Arrays.fill(row, -66666);
		}
		for(int col=0; col<matrix[0].length; col++) {
			ans=Math.min(ans, Minimum_Falling_Path(matrix,0,col));
		}
		
		System.out.println(ans);
	}
	
	public static int Minimum_Falling_Path2(int[][] matrix, int cr, int cc, int[][] dp) {
		if(cc<0 || cc>=matrix[0].length) {
			return Integer.MAX_VALUE;
		}
		if(cr==matrix.length-1) {
			return matrix[cr][cc];
		}
		if(dp[cr][cc]!=-66666) {
			return dp[cr][cc];
		}
		int ld=Minimum_Falling_Path2(matrix, cr+1, cc-1,dp);
		int rd=Minimum_Falling_Path2(matrix, cr+1, cc+1,dp);
		int d=Minimum_Falling_Path2(matrix, cr+1, cc,dp);
		return dp[cr][cc]=Math.min(ld, Math.min(rd, d))+matrix[cr][cc];
	}
	
	public static int Minimum_Falling_Path(int[][] matrix, int cr, int cc) {
		if(cc<0 || cc>=matrix[0].length) {
			return Integer.MAX_VALUE;
		}
		if(cr==matrix.length-1) {
			return matrix[cr][cc];
		}
		int ld=Minimum_Falling_Path(matrix, cr+1, cc-1);
		int rd=Minimum_Falling_Path(matrix, cr+1, cc+1);
		int d=Minimum_Falling_Path(matrix, cr+1, cc);
		return Math.min(ld, Math.min(rd, d))+matrix[cr][cc];
	}

}
