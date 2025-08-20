package lec15;

import java.util.Scanner;

public class reverse_words_in_a_string {

//	https://leetcode.com/problems/reverse-words-in-a-string/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(reverse(s));
		sc.close();
	}
	
	public static String reverse(String s) {
		s=s.trim();
		String[] arr=s.split("\s+");
		String ans="";
		for(int i=arr.length-1; i>=0; i--) {
			ans=ans+arr[i]+" ";
		}
		return ans.trim();
	}

}
