package Codeforces;

import java.util.Scanner;

public class Sereja_and_Dima {
	
//	https://codeforces.com/problemset/problem/381/A

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int s=0;
		int d=0;
		int l=0;
		int r=n-1;
		int turn=1;
		while(l<=r) {
			if(turn==1) {
				if(arr[l]>arr[r]) {
					s+=arr[l];
					l++;
				}
				else {
					s+=arr[r];
					r--;
				}
			}
			else {
				if(arr[l]>arr[r]) {
					d+=arr[l];
					l++;
				}
				else {
					d+=arr[r];
					r--;
				}
			}
			
			turn=1-turn;
		}
		
		System.out.println(s+" "+d);
		sc.close();
	}

}
