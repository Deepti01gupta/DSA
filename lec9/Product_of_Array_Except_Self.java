package lec9;

import java.util.Scanner;

public class Product_of_Array_Except_Self {

	// https://leetcode.com/problems/product-of-array-except-self/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);;
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0; i<n; i++) {
			nums[i]=sc.nextInt();
		}
		int[] ans=productExceptSelf(nums);
		for(int i=0; i<n; i++) {
			System.out.print(ans[i]+" ");
		}
		sc.close();
	}
	
	// tc : O(3N) and sc: O(2N)
	public static int[] productExceptSelf(int[] nums) {
		int n=nums.length;
		int[] left=new int[n];
		left[0]=1;
		for(int i=1; i<n; i++) {
			left[i]=left[i-1]*nums[i-1];
		}
		int[] right=new int[n];
		right[n-1]=1;
		for(int i=n-2; i>=0; i--) {
			right[i]=right[i+1]*nums[i+1];
		}
		int[] ans=new int[n];
		for(int i=0; i<n; i++) {
			ans[i]=left[i]*right[i];
		}
		return ans;
	}

}
