package Codeforces;

import java.util.Scanner;

public class Marathon {
	
//	https://codeforces.com/problemset/problem/1692/A

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			
			int ans=0;
			if(b>a) ans++;
			if(c>a) ans++;
			if(d>a) ans++;
			
			System.out.println(ans);
		}
		sc.close();

	}

}
