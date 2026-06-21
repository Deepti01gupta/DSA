package Codeforces;

import java.util.Scanner;

public class Anton_and_Polyhedrons {
	
//	https://codeforces.com/problemset/problem/785/A

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=0; i<n; i++) {
			String s=sc.next();
			if(s.charAt(0)=='T') {
				sum+=4;
			}
			else if(s.charAt(0)=='C') {
				sum+=6;
			}
			else if(s.charAt(0)=='O') {
				sum+=8;
			}
			else if(s.charAt(0)=='D') {
				sum+=12;
			}
			else if(s.charAt(0)=='I') {
				sum+=20;
			}
		}
		
		System.out.println(sum);
		sc.close();
	}

}
