package Codeforces;

import java.util.Scanner;

public class Magnets {
	
//	https://codeforces.com/problemset/problem/344/A

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=1;
		char prev='x';
		for(int i=0; i<n; i++) {
			String s=sc.next();
			if(s.charAt(0)==prev) {
				ans++;
			}
			prev=s.charAt(1);
		}
		
		System.out.println(ans);
		sc.close();
	}

}
