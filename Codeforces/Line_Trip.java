package Codeforces;

import java.util.Scanner;

public class Line_Trip {
	
//	https://codeforces.com/problemset/problem/1901/A

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int x=sc.nextInt();
			
			int[] arr=new int[n];
			for(int i=0; i<n; i++) {
				arr[i]=sc.nextInt();
			}
			
			int ans=arr[0];
			for(int i=1; i<n; i++) {
				ans=Math.max(ans, arr[i]-arr[i-1]);
			}
			
			ans=Math.max(ans, 2*(x-arr[n-1]));
			System.out.println(ans);
		}
		sc.close();
	}

}
