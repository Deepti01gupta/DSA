package Codeforces;

import java.util.Scanner;

public class Odd_One_Out {

//	https://codeforces.com/problemset/problem/1915/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int ans=0;
			for(int i=0; i<3; i++) {
				int v=sc.nextInt();
				ans=ans^v;
			}
			System.out.println(ans);
		}
		sc.close();
	}

}
