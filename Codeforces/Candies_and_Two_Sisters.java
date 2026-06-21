package Codeforces;

import java.util.Scanner;

public class Candies_and_Two_Sisters {
	
//	https://codeforces.com/problemset/problem/1335/A

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			System.out.println(solve(n));
		}
		sc.close();
	}
	
	public static int solve(int n) {
		if(n<3) {
			return 0;
		}
		
		int v=n/2;
		int r=n%2;
		
		if(r==1) {
			return v;
		}
		else {
			return v-1;
		}
	}

}
