package lec48;

import java.util.Arrays;

public class Edit_distance {

//	https://leetcode.com/problems/edit-distance/description/
//	https://www.spoj.com/problems/EDIST/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="FOOD";
		String t="MONEY";
		
//		System.out.println(Min_Ops(s,t,0,0));
		int[][] dp=new int[s.length()][t.length()];
		for(int i=0; i<s.length(); i++) {
			Arrays.fill(dp[i], -1);
		}
		System.out.println(Min_Ops1(s,t,0,0,dp));
	}
	
	public static int Min_Ops1(String s, String t, int i, int j, int[][] dp) {
		if(i==s.length()) {
			return t.length()-j;
		}
		if(j==t.length()) {
			return s.length()-i; 
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		
		int ans=0;
		if(s.charAt(i)==t.charAt(j)) {
			ans=1+Min_Ops1(s,t,i+1,j+1,dp);
		}
		else {
			int D=Min_Ops1(s,t,i+1,j,dp);  // delete
			int R=Min_Ops1(s,t,i+1,j+1,dp);  // replace
			int I=Min_Ops1(s,t,i,j+1,dp);  // insert
			ans=Math.min(D, Math.min(R, I))+1;
		}
		return dp[i][j]= ans;
	}
	
	public static int Min_Ops(String s, String t, int i, int j) {
		if(i==s.length()) {
			return t.length()-j;
		}
		if(j==t.length()) {
			return s.length()-i;
		}
		
		int ans=0;
		if(s.charAt(i)==t.charAt(j)) {
			ans=1+Min_Ops(s,t,i+1,j+1);
		}
		else {
			int D=Min_Ops(s,t,i+1,j);  // delete
			int R=Min_Ops(s,t,i+1,j+1);  // replace
			int I=Min_Ops(s,t,i,j+1);  // insert
			ans=Math.min(D, Math.min(R, I))+1;
		}
		return ans;
	}

}
