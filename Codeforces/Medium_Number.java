package Codeforces;

import java.util.Scanner;

public class Medium_Number {

//	https://codeforces.com/problemset/problem/1760/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			
			if((a>b && a<c) || (a>c && a<b)) {
				System.out.println(a);
			}
			else if((b>c && b<a) || (b<c && b>a)) {
				System.out.println(b);
			}
			else {
				System.out.println(c);
			}
		}
		
		sc.close();
		
	}

}
