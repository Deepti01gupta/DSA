package Codeforces;

import java.util.Scanner;

public class Codeforces_Checking {

//	https://codeforces.com/problemset/problem/1791/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		String str="codeforces";
		
		while(t-->0) {
			String ch=sc.next();
			if(str.indexOf(ch)!=-1) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		sc.close();
	}

}
