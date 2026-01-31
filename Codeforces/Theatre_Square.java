package Codeforces;

import java.util.*;

public class Theatre_Square {
	
//	https://codeforces.com/problemset/problem/1/A

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long m=sc.nextLong();
		long a=sc.nextLong();

		long tilesN=(n+a-1)/a;
		long tilesM=(m+a-1)/a;

		long ans=tilesN*tilesM;
		System.out.println(ans);
		sc.close();
		
	}

}
