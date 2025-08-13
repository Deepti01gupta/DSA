package lec6;

import java.util.Scanner;

public class Inverse_of_number {

//	https://codeskiller.codingblocks.com/problems/698
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		int i=1;
		while(n>0) {
			int r=n%10;
			rev+=i*(int)Math.pow(10,r-1);
			n=n/10;
			i++;
		}
		System.out.println(rev);
		sc.close();
	}

}