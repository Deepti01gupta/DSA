package Codeforces;

import java.util.*;

//https://codeforces.com/problemset/problem/112/A
public class Petya_and_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next().toLowerCase();
		String t=sc.next().toLowerCase();

		sc.close();
		if(s.equals(t)) {
			System.out.println(0);
			return;
		}
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==t.charAt(i)) {
				continue;
			}
			if(s.charAt(i)<t.charAt(i)) {
				System.out.println(-1);
				return;
			}
			if(s.charAt(i)>t.charAt(i)) {
				System.out.println(1);
				return;
			}
		}
	}

}
