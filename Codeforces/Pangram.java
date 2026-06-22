package Codeforces;

import java.util.Scanner;

public class Pangram {
	
//	https://codeforces.com/problemset/problem/520/A

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.nextInt();
		
		String s=sc.next().toLowerCase();
		int[] arr=new int[26];
		for(char ch:s.toCharArray()) {
			arr[ch-'a']++;
		}
		
		for(int i=0; i<26; i++) {
			if(arr[i]==0) {
				System.out.println("NO");
				sc.close();
				return;
			}
		}
		
		System.out.println("YES");
		sc.close();

	}

}
