package Codeforces;

import java.util.Scanner;

public class Dreamoon_and_Stairs {
	
//	https://codeforces.com/problemset/problem/476/A

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int move=(n+1)/2;
		
		for(int k=move; k<=n; k++) {
			if(k%m==0) {
				System.out.println(k);
				sc.close();
				return;
			}
		}
		
		System.out.println(-1);
		sc.close();
	}

}
