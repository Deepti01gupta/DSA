package Codeforces;

import java.util.Scanner;

public class Game_with_Integers {

//	https://codeforces.com/problemset/problem/1899/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			if(n%3==0) {
				System.out.println("Second");
			}
			else {
				System.out.println("First");
			}
		}
		
		sc.close();
	}

}
