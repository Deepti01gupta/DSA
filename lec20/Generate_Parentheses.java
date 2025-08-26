package lec20;

import java.util.*;

public class Generate_Parentheses {

//	https://leetcode.com/problems/generate-parentheses/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		List<String> res=new ArrayList<>();
		generateParenthesis(n,"",res,0,0);
		for(int i=0; i<res.size(); i++) {
			System.out.print(res.get(i)+" ");
		}
	}
	
	public static void generateParenthesis(int n, String ans, List<String> res, int open, int close) {
		if(open==n && close==n) {
			res.add(ans);
		}
		if(open>n || close>n || close>open) {
			return;
		}
		generateParenthesis(n,ans+'(',res,open+1, close);
		generateParenthesis(n,ans+')',res,open, close+1);
    }
}
