package lec13;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_cows {

	// https://www.spoj.com/problems/AGGRCOW/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);;
		int n=sc.nextInt();
		int c=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int x=distance(arr,c);
		System.out.println(x);
		sc.close();
	}
	public static int distance(int[] arr, int c) {
		Arrays.sort(arr);;
		int n=arr.length;
		int ans=0;
		int lo=1, hi=arr[n-1];
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(ispossible(arr,mid,c)==true) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return ans;
	}
	
	public static boolean ispossible(int[] arr, int mid, int c) {
		int cow=1;
		int pos=arr[0];
		int i=1;
		while(i<arr.length) {
			if(arr[i]-pos>=mid) {
				cow++;
				pos=arr[i];
				if(cow==c) {
					return true;
				}
			}
			i++;
		}
		return false;
	}

}
