/*
 You are given a sorted array arr of distinct values and
  a target value x. You need to search for the index of
   the target value in the array.
   
   Input Format: arr[] = {1,2,4,7}, x = 6
Result: 3
Explanation: 6 is not present in the array. 
So, if we will insert 6 in the 3rd index(0-based indexing), 
the array will still be sorted. {1,2,4,6,7}.

Example 2:
Input Format: arr[] = {1,2,4,7}, x = 2
Result: 1
Explanation: 2 is present in the array and so we will
 return its index i.e. 1.
 */

// https://leetcode.com/problems/search-insert-position/description/


package Binary_Search;

import java.util.Scanner;

public class Seach_Insert_Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		System.out.println(fun(arr,x));
	}
	public static int fun(int[] arr, int x) {
		int lo=0;
		int hi=arr.length-1;
		int ans=0;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(arr[mid]==x) {
				return mid;
			}
			if(arr[mid]>x) {
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return lo;
	}

}
