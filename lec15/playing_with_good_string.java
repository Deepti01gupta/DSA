package lec15;

import java.util.Scanner;

public class playing_with_good_string {

//	https://codeskiller.codingblocks.com/problems/549
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(count(s));
		sc.close();
	}
	public static int count(String s) {
		int c=0;
		int ans=0;
		for(int i=0; i<s.length(); i++) {
			if(is_vowel(s.charAt(i))) {
				c++;
			}
			else {
				ans=Math.max(ans, c);
				c=0;
			}
		}
		ans=Math.max(ans, c);
		return ans;
	}
	public static boolean is_vowel(Character ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			return true;
		}
		return false;
	}

}
