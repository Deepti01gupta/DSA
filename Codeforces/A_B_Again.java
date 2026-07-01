package Codeforces;

import java.util.Scanner;

public class A_B_Again {

//	https://codeforces.com/problemset/problem/1999/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int sum=n%10;
			sum+=n/10;
			System.out.println(sum);
		}
		sc.close();
	}
}
