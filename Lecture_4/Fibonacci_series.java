package lec4;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		for(int i=1; i<=n; i++) {
			System.out.print(b+" ");
			int c=a+b;
			a=b;
			b=c;
		}
		sc.close();
	}

}
