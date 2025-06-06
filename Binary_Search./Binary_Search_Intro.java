/*1. You are given a sorted array of integers and a target, 
your task is to search for the target in the given array.
Assume the given array does not contain any duplicate numbers. 

input: array = {3, 4, 6, 7, 9, 12, 16, 17} and target = 6.
output: 2
*/

//  https://leetcode.com/problems/binary-search/description/


package Binary_Search;
import java.util.*;

public class Binary_Search_Intro {

	public static void main(String[] args) { // O(log N base 2)
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		
		// linear code
		System.out.println(fun(arr,target));
		
		// recurssive function
//		System.out.print(fun(arr,target,0,n-1));
	}
	
	public static int fun(int[] arr, int target) {
		Arrays.sort(arr);
		int lo=0, hi=arr.length;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]>target) {
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return -1;
	}
	
//	public static int fun(int[] arr, int target, int lo, int hi) {
//		if(lo>hi) {
//			return -1;
//		}
//		int mid=lo+(hi-lo)/2;
//		if(arr[mid]==target) {
//			return mid;
//		}
//		else if(target>arr[mid]) {
//			return fun(arr,target,mid+1,hi);
//		}
//		else {
//			return fun(arr, target,lo,mid-1);
//		}
//	}

}
