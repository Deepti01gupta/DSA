package lec5;

import java.util.*;
public class dec_to_bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0, mul=1;
		while(n>0) {
			int rem=n%2;
			sum+=rem*mul;
			n=n/2;
			mul*=10;
		}
		System.out.println(sum);
		sc.close();
	}
 
} 
