package lec70;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Two_Arrays_and_Sum_of_Functions {

//	https://codeforces.com/problemset/problem/1165/E
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long mod=998244353;
		
		long[] a=new long[n];
		for(int i=0; i<n; i++) {
			long x=sc.nextLong();
			a[i]=(long)(i+1)*(n-i)*x;
		}
		
		Integer[] b=new Integer[n];
		for(int i=0; i<n; i++) {
			b[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		Arrays.sort(b,Collections.reverseOrder());
		
		long ans=0;
		for(int i=0; i<n; i++) {
			ans=(ans+(a[i]%mod)*b[i])%mod;
		}
		
		System.out.println(ans);
		
		
		
		sc.close();
		
	}
	

}
