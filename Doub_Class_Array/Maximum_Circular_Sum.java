package Doub_Class_Array;

import java.util.Scanner;

public class Maximum_Circular_Sum {

//	https://leetcode.com/problems/maximum-sum-circular-subarray/
//	https://codeskiller.codingblocks.com/problems/1077
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int ans=max_sum(arr);
		System.out.println(ans);
		sc.close();
	}
	
	public static int max_sum(int[] arr) {
		int linear_sum=kadens(arr);
		
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			arr[i]=-arr[i];
		}
		
		int mid=kadens(arr);
		int circularsum=sum+mid;
		if(circularsum==0) {
			return linear_sum;
		}
		return Math.max(linear_sum, circularsum);
		
	}
	
	
	public static int kadens(int[] arr) {
		int ans=0;
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			ans=Math.max(ans, sum);
			if(sum<0) {
				sum=0;
			}
		}
		return ans;
	}

}
