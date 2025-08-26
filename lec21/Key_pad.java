package lec21;

import java.util.*;

public class Key_pad {

	static String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "23";
		List<String> ll = new ArrayList<>();
		Combinations(ques, "", ll);
		System.out.println(ll);
	}
	
	public static void Combinations(String s, String ans, List<String> ll) {
		if(s.length()==0) {
			ll.add(ans);
			return;
		}
		char ch=s.charAt(0);
		int n=ch-'0';
		String press=map[n];
		for(int i=0; i<press.length(); i++) {
			Combinations(s.substring(1),ans+press.charAt(i),ll);
		}
	}

}
