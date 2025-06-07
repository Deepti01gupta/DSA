/*
 Problem Statement: You're given an sorted array arr of n integers
  and an integer x. Find the floor and ceiling of x in arr[0..n-1].
The floor of x is the largest element in the array which is 
smaller than or equal to x.
The ceiling of x is the smallest element in the array greater 
than or equal to x.

Example 1:
Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5
Result: 4 7
Explanation: The floor of 5 in the array is 4, and 
the ceiling of 5 in the array is 7.

Example 2:
Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 8
Result: 8 8
Explanation: The floor of 8 in the array is 8, and 
the ceiling of 8 in the array is also 8.
 */




package Binary_Search;

import java.util.Scanner;

public class Floor_and_Ceil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		System.out.println(floor(arr,x)+" "+ceil(arr,x));
	}
	public static int floor(int[] arr, int x) {
		int lo=0;
		int hi=arr.length-1;
		int ans=-1;
		while(lo<hi) {
			int mid=lo+(hi-lo)/2;
			if(arr[mid]<=x) {
				ans=arr[mid];
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return ans;
	}
	public static int ceil(int[] arr, int x) {
		int lo=0;
		int hi=arr.length-1;
		int ans=-1;
		while(lo<hi) {
			int mid=lo+(hi-lo)/2;
			if(arr[mid]>=x) {
				ans=arr[mid];
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
	}

}
