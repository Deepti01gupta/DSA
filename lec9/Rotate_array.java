package lec9;

import java.util.Scanner;

public class Rotate_array {

	// https://leetcode.com/problems/rotate-array/description/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0; i<n; i++) {
			nums[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		rotate_array2(nums,k);
		for(int i=0; i<n; i++) {
			System.out.print(nums[i]+" ");
		}
		sc.close();
	}
	
	public static void rotate_array2(int[] nums, int k) {
		int n=nums.length;
		k=k%n;
		reverse(nums,0,n-k-1);
		reverse(nums,n-k,n-1);
		reverse(nums,0,nums.length-1);
	}
	public static void reverse(int[] nums, int i, int j) {
		while(i<j) {
			int temp=nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
			i++;
			j--;
		}
	}
	
	// tc: O(K*n) 
	public static void rotate_array1(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		for (int j = 1; j <= k; j++) {

			int item = arr[n - 1];
			for (int i = n - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = item;
		}
	}

}
