/*
Given a sorted array of N integers and an integer x, 
write a program to find the upper bound of x.

Input Format: N = 4, arr[] = {1,2,2,3}, x = 2
Result: 3

Input Format: N = 5, arr[] = {3,5,8,15,19}, x = 9
Result: 3
*/





package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Upper_Bound {

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
		Arrays.sort(arr);
		int lo=0, hi=arr.length-1;
		int ans=arr.length;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(arr[mid]>x) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
	}

}
