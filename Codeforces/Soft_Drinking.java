package Codeforces;

import java.util.Scanner;

public class Soft_Drinking {

//	https://codeforces.com/problemset/problem/151/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int l=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int p=sc.nextInt();
		int nl=sc.nextInt();
		int np=sc.nextInt();
		
		int v1=(k*l)/nl;
		int v2=(c*d);
		int v3=(p/np);
		
		int ans=Math.min(v2, Math.min(v1, v3))/n;
		System.out.println(ans);
		
		sc.close();

	}

}
