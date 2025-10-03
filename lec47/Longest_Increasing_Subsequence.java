package lec47;

import java.util.*;

public class Longest_Increasing_Subsequence {

	
//	https://leetcode.com/problems/longest-increasing-subsequence/
	public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=0; i<nums.length; i++){
            for(int j=i-1; j>=0; j--){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int max=dp[0];
        for(int i=1; i<dp.length; i++){
            max=Math.max(max,dp[i]);
        }
        return max;
    }

}
