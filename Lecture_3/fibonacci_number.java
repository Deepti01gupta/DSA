package lec3;

import java.util.*;

public class fibonacci_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		if(n==0) {
			System.out.println(a);
		}
		if(n==1) {
			System.out.println(b);
		}
		for(int i=1; i<=n; i++) {
			int c=a+b;
			a=b;
			b=c;
		}
		System.out.println(a);

	}
}
