package lec4;

import java.util.Scanner;

public class Sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		System.out.println(sum);
		sc.close();
	}

}
