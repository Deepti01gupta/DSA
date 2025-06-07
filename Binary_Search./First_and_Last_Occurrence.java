/*
 Given a sorted array of N integers, write a program to 
 find the index of the last occurrence of the target key. 
 If the target is not found then return -1.

Note: Consider 0 based indexing

Examples:

Example 1:
Input: N = 7, target=13, array[] = {3,4,13,13,13,20,40}
Output: 4
Explanation: As the target value is 13 , it appears for the first 
time at index number 2.

Example 2:
Input: N = 7, target=60, array[] = {3,4,13,13,13,20,40}
Output: -1
Explanation: Target value 60 is not present in the array 
 */

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

package Binary_Search;

import java.util.Scanner;

public class First_and_Last_Occurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		System.out.println(first(arr,x));
		System.out.println(last(arr,x));
	}
	public static int first(int[] arr, int x) {
		int lo=0;
		int hi=arr.length-1;
		int ans=-1;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(arr[mid]==x) {
				ans=mid;
				hi=mid-1;
			}
			else if(arr[mid]>x) {
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
	}
	public static int last(int[] arr, int x) {
		int lo=0;
		int hi=arr.length-1;
		int ans=-1;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(arr[mid]==x) {
				ans=mid;
				lo=mid+1;
			}
			else if(arr[mid]>x) {
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
	}

}
