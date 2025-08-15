package lec13;

import java.util.Arrays;
import java.util.Scanner;

public class Book_allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);;
		int n=sc.nextInt();
		int s=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int x=allocation(arr,s);
		System.out.println(x);
		sc.close();
	}
	
	public static int allocation(int[] arr, int s) {
		Arrays.sort(arr);;
		int n=arr.length;
		int ans=0;
		int lo=1, hi=0;
		for(int i=0; i<n; i++) {
			hi+=arr[i];
		}
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(ispossible(arr,mid,s)==true) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
	}
	
	public static boolean ispossible(int[] arr, int mid, int s) {
		int st=1;
		int curr=0;
		int i=0;
		while(i<arr.length) {
			if(curr+arr[i]<=mid) {
				curr+=arr[i];
				i++;
			}
			else {
				st++;
				if(st>s) {
					return false;
				}
				curr=arr[i];
				i++;
			}
		}
		return true;
	}

}
