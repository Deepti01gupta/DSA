package lec23;

import java.util.*;

public class Palindrome_Partitioning {

//	https://leetcode.com/problems/palindrome-partitioning/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="aab";
		List<List<String>> ll=new ArrayList<>();
		palindrome(s,ll,new ArrayList<>());
		System.out.println(ll);
	}
	public static void palindrome(String s, List<List<String>> ll, List<String> ans) {
		if(s.length()==0) {
			ll.add(new ArrayList<>(ans));
			return;
		}
		
		for(int i=1; i<=s.length(); i++) {
			String str=s.substring(0,i);
			if(is_pal(str)) {
				ans.add(str);
				palindrome(s.substring(i),ll,ans);
				ans.remove(ans.size()-1);
			}
		}
		
	}
	
	public static boolean is_pal(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	

}
