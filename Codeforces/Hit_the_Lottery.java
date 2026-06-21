package Codeforces;

import java.util.Scanner;

public class Hit_the_Lottery {

//	https://codeforces.com/problemset/problem/996/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int ans=0;
		if(n>=100) {
			ans+=(n/100);
			n=n%100;
		}
		if(n>=20) {
			ans+=(n/20);
			n=n%20;
		}
		if(n>=10) {
			ans+=(n/10);
			n=n%10;
		}
		if(n>=5) {
			ans+=(n/5);
			n=n%5;
		}
		ans+=n;
		
		System.out.println(ans);
		sc.close();
	}

}
