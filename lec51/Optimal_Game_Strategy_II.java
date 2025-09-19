package lec51;

import java.util.Arrays;

public class Optimal_Game_Strategy_II {

//	https://leetcode.com/problems/predict-the-winner/description/
//	https://codeskiller.codingblocks.com/problems/1255
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,1,4};
		
//		System.out.println(optimal_game_strategy(arr,0,arr.length-1));

		int[][] dp=new int[arr.length][arr.length];
		for(int i=0; i<arr.length; i++) {
			Arrays.fill(dp[i], -1);
		}
		System.out.println(optimal_game_strategy_2(arr,0,arr.length-1,dp));

	}
	
	
	public static int optimal_game_strategy_2(int[] arr, int i, int j, int[][] dp) {
		if(i>j) {
			return 0;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int f=arr[i] + Math.min(optimal_game_strategy_2(arr,i+2,j,dp) , optimal_game_strategy_2(arr,i+1,j-1,dp));
		int s=arr[j] + Math.min(optimal_game_strategy_2(arr,i+1,j-1,dp) , optimal_game_strategy_2(arr,i,j-2,dp));
		return dp[i][j]=Math.max(f, s);
	}
	
//	public static int optimal_game_strategy(int[] arr, int i, int j) {
//		if(i>j) {
//			return 0;
//		}
//		
//		int f=arr[i] + Math.min(optimal_game_strategy(arr,i+2,j) , optimal_game_strategy(arr,i+1,j-1));
//		int s=arr[j] + Math.min(optimal_game_strategy(arr,i+1,j-1) , optimal_game_strategy(arr,i,j-2));
//		return Math.max(f, s);
//	}

}
