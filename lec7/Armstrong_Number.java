package lec7;

import java.util.Scanner;

public class Armstrong_Number {

//	https://codeskiller.codingblocks.com/problems/1102
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(is_armstrong(n)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		sc.close();
	}
	
	public static boolean is_armstrong(int n) {
		int c=count(n);
		int t=n;
		int new_num=0;
		while(t>0) {
			int r=t%10;
			new_num+=Math.pow(r, c);
			t=t/10;
		}
		if(n==new_num) {
			return true;
		}
		return false;
	}
	
	public static int count(int n) {
		int c=0;
		while(n>0) {
			n=n/10;
			c++;
		}
		return c;
	}

}
