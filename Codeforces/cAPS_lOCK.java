package Codeforces;

import java.util.Scanner;

public class cAPS_lOCK {

//	https://codeforces.com/problemset/problem/131/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		boolean change=true;
		
		for(int i=1; i<str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				change=false;
				break;
			}
		}
		
		if(change) {
			StringBuilder sb=new StringBuilder();
			for(char c:str.toCharArray()) {
				if(Character.isUpperCase(c)) {
					sb.append(Character.toLowerCase(c));
				}
				else {
					sb.append(Character.toUpperCase(c));
				}
			}
			System.out.println(sb.toString());
		}
		else {
			System.out.println(str);
		}
		sc.close();
	}

}
