package Codeforces;

import java.util.Scanner;

public class Chat_room {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		String target="hello";
		int j=0;
		
		for(int i=0; i<s.length() && j<target.length(); i++) {
			if(s.charAt(i)==target.charAt(j)) {
				j++;
			}
		}
		
		if(j==target.length()) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		sc.close();
	}

}
