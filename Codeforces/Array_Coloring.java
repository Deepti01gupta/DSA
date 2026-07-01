package Codeforces;

import java.util.Scanner;

public class Array_Coloring {

//	https://codeforces.com/problemset/problem/1857/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int c=0;
			
			for(int i=0; i<n; i++) {
				int v=sc.nextInt();
				if(v%2==1) {
					c++;
				}
			}
			
			if(c%2==0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		sc.close();
	}

}
