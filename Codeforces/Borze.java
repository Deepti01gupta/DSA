package Codeforces;

import java.util.Scanner;

public class Borze {

//	https://codeforces.com/problemset/problem/32/B
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			if(ch=='.') {
				sb.append(0);
			}
			else if(ch=='-' && ((i+1)<s.length() && s.charAt(i+1)=='.')) {
				sb.append(1);
				i++;
			}
			else {
				sb.append(2);
				i++;
			}
		}
		
		System.out.println(sb.toString());
		sc.close();
	}

}
