package Codeforces;

import java.util.Scanner;

public class Drinks {

//	https://codeforces.com/problemset/problem/200/B
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double sum=0;
		for(int i=0; i<n; i++) {
			int val=sc.nextInt();
			sum += (double) val / 100;
		}
		
		double ans=(sum/n) * 100;;
		System.out.println(ans);
		sc.close();
	}

}
