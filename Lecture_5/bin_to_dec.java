package lec5;

import java.util.Scanner;

public class bin_to_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0, mul=1;
		while(n>0) {
			int rem=n%10;
			sum+=rem*mul;
			n=n/10;
			mul*=2;
		}
		System.out.println(sum);
		sc.close();
	}

}
