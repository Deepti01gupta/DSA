package lec47;

//import java.util.*;

public class House_Robber {

	// https://leetcode.com/problems/house-robber/
	public int rob(int[] nums) {
		
//		return Robber1(nums,0);  // tle 
		
//        int[] dp=new int[nums.length];
//        Arrays.fill(dp,-1);
//         return Robber2(nums,0,dp);
        
//         return Robber3(nums,nums.length-1,dp);
        
        return RobberBU(nums);
    }
	
	public int RobberBU(int[] arr) {
		if(arr.length==1) {
			return arr[0];
		}
		int[] dp=new int[arr.length];
		dp[1]=Math.max(arr[1], arr[1]);
		for(int i=2; i<arr.length; i++) {
			int rob = arr[i] + Robber2(arr,i-2,dp);
			int dont_rob = Robber2(arr,i-1,dp);
			dp[i]=Math.max(rob, dont_rob);
		}
		return dp[dp.length-1];
	}
	
	public int Robber3(int[] arr, int i, int[] dp) {
		if(i<0) {
			return 0;
		}
		if(dp[i]!=-1) {
			return dp[i];
		}
		
		int rob = arr[i] + Robber2(arr,i-2,dp);
		int dont_rob = Robber2(arr,i-1,dp);
		return dp[i]=Math.max(rob, dont_rob);
	}
	
	
	public int Robber2(int[] arr, int i, int[] dp) {
		if(i>=arr.length) {
			return 0;
		}
		if(dp[i]!=-1) {
			return dp[i];
		}
		
		int rob = arr[i] + Robber2(arr,i+2,dp);
		int dont_rob = Robber2(arr,i+1,dp);
		return dp[i]=Math.max(rob, dont_rob);
	}
	
	
	// tle for long test case
	public int Robber1(int[] arr, int i) {
		if(i>=arr.length) {
			return 0;
		}
		
		int rob = arr[i] + Robber1(arr,i+2);
		int dont_rob = Robber1(arr,i+1);
		return Math.max(rob, dont_rob);
	}
}
