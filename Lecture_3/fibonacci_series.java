package lec3;

import java.util.*;

public class fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" ");
		for(int i=2; i<=n; i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.print(a+" ");
		}
	}
}
