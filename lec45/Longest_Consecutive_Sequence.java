package lec45;

//import java.util.*;

public class Longest_Consecutive_Sequence {

	
//	https://leetcode.com/problems/longest-consecutive-sequence/description/
	public int longestConsecutive(int[] nums){
        HashMap<Integer, Boolean> hm=new HashMap<>();

     // agar key se choti valie present h to key is start nahi krenge
        for(int i=0; i<nums.length; i++){
        	if(hm.containsKey(nums[i]-1)){
                hm.put(nums[i],false);
            }
        	else {
        		hm.put(nums[i],true);
        	}
        	if(hm.containsKey(nums[i]+1)) {
        		hm.put(nums[i]+1,false);
        	}
        }
        
        int max=0;
        for(int key:hm.keySet()){
            int k=1;
            if(hm.get(key)==true){
                while(hm.containsKey(key+k)==true){
                    k++;
                }
            }
            max=Math.max(max,k);
        }
        return max;
    }

    // time complexcity: O(N.logN)
    // public int longestConsecutive(int[] nums) {
    //     if(nums.length==0){
    //         return 0;
    //     }
    //     Arrays.sort(nums);
    //     int n=nums.length;
    //     int t=nums[0];
    //     int c=1;
    //     int ans=1;
    //     int i=1;
    //     while(i<n){
    //         if(nums[i]==t+1){
    //             t=nums[i];
    //             c++;
    //         }
    //         else if(nums[i]!=t){
    //             ans=Math.max(ans,c);
    //             c=1;
    //             t=nums[i];
    //         }
    //         i++;
    //     }
    //     ans=Math.max(ans,c);
    //     return ans;
    // }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
