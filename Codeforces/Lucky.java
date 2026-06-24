package Codeforces;

import java.util.Scanner;

public class Lucky {

//	https://codeforces.com/problemset/problem/1676/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			String s=sc.next();
			int s1=(s.charAt(0)-'0')+(s.charAt(1)-'0')+(s.charAt(2)-'0');
			int s2=(s.charAt(3)-'0')+(s.charAt(4)-'0')+(s.charAt(5)-'0');
			
			if(s1==s2) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		sc.close();
	}

}
