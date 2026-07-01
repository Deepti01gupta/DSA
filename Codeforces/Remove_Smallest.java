package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_Smallest {

//	https://codeforces.com/problemset/problem/1399/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			for(int i=0; i<n; i++) {
				arr[i]=sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			boolean flag=true;
			for(int i=1; i<n; i++) {
				if(arr[i]-arr[i-1]>1) {
					flag=false;
				}
			}
			
			if(flag) System.out.println("YES");
			else System.out.println("NO");
		}
		sc.close();
	}

}
