package Codeforces;

import java.util.Scanner;

public class String_Task {

//	https://codeforces.com/problemset/problem/118/A
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next().toLowerCase();
		
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!='a' && s.charAt(i)!='o' && s.charAt(i)!='y' && s.charAt(i)!='e' && s.charAt(i)!='u' && s.charAt(i)!='i'){
				sb.append(".");
				sb.append(s.charAt(i));
			}
		}
		
		System.out.println(sb.toString());
		sc.close();
		
	}

}
