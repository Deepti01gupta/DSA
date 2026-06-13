package Codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class I_Wanna_Be_the_Guy {
	
//	https://codeforces.com/problemset/problem/469/A

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Set<Integer> st=new HashSet<>();
		
		int x=sc.nextInt();
		for(int i=0; i<x; i++) {
			int v=sc.nextInt();
			st.add(v);
		}
		
		int y=sc.nextInt();
		for(int i=0; i<y; i++) {
			int v=sc.nextInt();
			st.add(v);
		}
		
		if(st.size()==n) {
			System.out.println("I become the guy.");
		}
		else {
			System.out.println("Oh, my keyboard!");
		}
		
		sc.close();
	}

}
