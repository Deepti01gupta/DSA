package Codeforces;

import java.util.Scanner;

public class Vasya_the_Hipster {
	
//	https://codeforces.com/problemset/problem/581/A

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int b=sc.nextInt();
		
		if(r<b) {
			int v1=r;
			b=b-r;
			int v2=b/2;
			System.out.println(v1+" "+v2);
		}
		else {
			int v1=b;
			r=r-b;
			int v2=r/2;
			System.out.println(v1+" "+v2);
		}
		sc.close();
	}

}
