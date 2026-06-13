package Codeforces;

import java.util.*;

public class Arrival_of_the_General {

//	https://codeforces.com/problemset/problem/144/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		int max=0;
		int min=0;
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if(arr[i]>arr[max]) {
				max=i;
			}
		}
		
		for(int i=0; i<n; i++) {
			if(arr[i]<=arr[min]) {
				min=i;
			}
		}
		
		int ans=max+(n-1-min);
		
		if(max>min) ans--;
		
		System.out.println(ans);
		sc.close();
	}

}
