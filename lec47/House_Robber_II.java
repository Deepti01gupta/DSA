package lec47;

import java.util.*;

public class House_Robber_II {

//	https://leetcode.com/problems/house-robber-ii/description/
	public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int[] dp1=new int[n];
        Arrays.fill(dp1,-1);
        int case1=Rob(nums,0,n-2,dp1);

        int[] dp2=new int[n];
        Arrays.fill(dp2,-1);
        int case2=Rob(nums,1,n-1,dp2);

        return Math.max(case1,case2);
    }

    public int Rob(int[] nums, int i, int end, int[] dp){
        if(i>end){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int rob=nums[i] + Rob(nums,i+2,end,dp);
        int dont_rob=Rob(nums,i+1,end,dp);
        return dp[i]=Math.max(rob,dont_rob);
    }
    
}
