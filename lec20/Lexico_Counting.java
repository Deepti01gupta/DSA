package lec20;

public class Lexico_Counting {

//	https://leetcode.com/problems/lexicographical-numbers/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1000;
		lexico(n,0);
	}
	
	public static void lexico(int n, int curr) {
		if(curr>n) {
			return;
		}
		System.out.println(curr);
		int i=0;
		if(curr==0) {
			i=1;
		}
		for(; i<=9; i++) {
			lexico(n,curr*10+i);
		}
	
	}

}
