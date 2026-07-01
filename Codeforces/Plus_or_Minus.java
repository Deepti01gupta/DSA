package Codeforces;

import java.util.Scanner;

public class Plus_or_Minus {
	
//	https://codeforces.com/problemset/problem/1807/A

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			
			if(a+b==c) {
				System.out.println("+");
			}
			else {
				System.out.println("-");
			}
		}
		
		sc.close();

	}

}
