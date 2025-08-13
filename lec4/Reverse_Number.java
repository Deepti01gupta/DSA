package lec4;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=n;
		int rev=0;
		while(t>0) {
			int r=t%10;
			rev=rev*10+r;
			t/=10;
		}
		System.out.println(rev);
		sc.close();
	}

}
