package Codeforces;

import java.util.Scanner;

public class Benches {

//	https://codeforces.com/problemset/problem/630/H
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		long ans=fac(5) * ncr(n,5) * ncr(n,5);
		System.out.println(ans);
		sc.close();
	}
	
	private static long ncr(int n, int r){
		long res=1;
		for(int i=0; i<r; i++) {
			res=res * (n-i) / (i+1);
		}
		return res;
	}
	
	private static long fac(int n) {
		long pro=1;
		for(int i=1; i<=n; i++) {
			pro*=i;
		}
		
		return pro;
	}
}
