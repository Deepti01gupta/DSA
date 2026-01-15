package lec62;

import java.util.Scanner;

public class Ehab_the_Xorcist {
	
//	https://codeforces.com/problemset/problem/1325/D
	
	
	//  (p + q) = (p ^ q) + 2 (p & q)
	//  (u + x) = (u ^ x) + 2 (u & x)
	// xor > sum : never
	// sum>=xor : correct
	
	// v > u: -1
	// u == v: 0
	// v - u: must be even 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long u=sc.nextLong();  // xor
		long v=sc.nextLong();  // sum
		
		if(u>v | u%2!=v%2) {
			System.out.println(-1);
		}
		else if(u==v) {
			if(u==0) {
				System.out.println(0);
			}
			else {
				System.out.println(1);
				System.out.println(u);
			}
		}
		else {
			long x=(v-u)/2;
			if((u&x)==0) {
				System.out.println(2);
				System.out.println(u+x + " " + x);
			}
			else {
				System.out.println(3);
				System.out.println(u + " " + x + " " + x);
			}
		}
		
		sc.close();
	}
	
	
	

}
