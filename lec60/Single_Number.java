package lec60;

public class Single_Number {
	
//	https://leetcode.com/problems/single-number/
	public static int singleNumber(int[] nums) {
		int ans=0;
		for(int i:nums) {
			ans=ans^i;
		}
		return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,2,1};
		System.out.println(singleNumber(nums));
	}

}