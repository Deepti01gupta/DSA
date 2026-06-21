package Codeforces;

import java.util.Scanner;

public class Police_Recruits {

//	https://codeforces.com/problemset/problem/427/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int ans=0;
		int sum=0;
		for(int i=0; i<n; i++) {
			int v=sc.nextInt();
			if(v>0) {
				sum+=v;
			}
			else {
				if(sum>0) {
					sum--;
				}
				else {
					ans++;
				}
			}
		}
		
		System.out.println(ans);
		sc.close();
	}

}
