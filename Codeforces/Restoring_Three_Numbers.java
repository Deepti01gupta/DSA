package Codeforces;

import java.util.Scanner;

public class Restoring_Three_Numbers {

//	https://codeforces.com/problemset/problem/1154/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ab=sc.nextInt();
		int ac=sc.nextInt();
		int bc=sc.nextInt();
		int abc=sc.nextInt();
		
		int total=Math.max(ab,  Math.max(ac, Math.max(bc, abc)));
		
		if(ab!=total) {
			System.out.print((total-ab)+" ");
		}
		if(ac!=total) {
			System.out.print((total-ac)+" ");
		}
		if(bc!=total) {
			System.out.print((total-bc)+" ");
		}
		if(abc!=total) {
			System.out.println((total-abc)+" ");
		}
		sc.close();
		
	}

}
