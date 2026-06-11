package Codeforces;

import java.util.Scanner;

public class Presents {
	
//	https://codeforces.com/problemset/problem/136/A

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] ans=new int[n];
		for(int i=0; i<n; i++) {
			int v=sc.nextInt();
			ans[v-1]=i+1;
		}
		
		for(int i:ans) {
			System.out.print(i+" ");
		}
		
		sc.close();

	}

}
