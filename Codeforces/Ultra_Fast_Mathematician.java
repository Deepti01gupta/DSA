package Codeforces;

import java.util.Scanner;

public class Ultra_Fast_Mathematician {

//	https://codeforces.com/problemset/problem/61/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=t.charAt(i)) {
				sb.append('1');
			}
			else {
				sb.append('0');
			}
		}
		
		System.out.println(sb.toString());
		sc.close();
	}

}
