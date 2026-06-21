package Codeforces;

import java.util.Scanner;

public class Amusing_Joke {

//	https://codeforces.com/problemset/problem/141/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		String s=sc.next();
		
		int[] arr1=new int[26];
		for(char ch:s1.toCharArray()) {
			arr1[ch-'A']++;
		}
		for(char ch:s2.toCharArray()) {
			arr1[ch-'A']++;
		}
		
		int[] arr2=new int[26];
		for(char ch:s.toCharArray()) {
			arr2[ch-'A']++;
		}
		
		for(int i=0; i<26; i++) {
			if(arr2[i]!=arr1[i]) {
				System.out.println("NO");
				sc.close();
				return;
			}
		}
		
		System.out.println("YES");
		sc.close();
	}

}
