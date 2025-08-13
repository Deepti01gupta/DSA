package lec4;

import java.util.Scanner;

public class Check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				c++;
				break;
			}
		}
		if(c==1) {
			System.out.println("Not prime");
		}
		else {
			System.out.println("Prime");
		}
		sc.close();
	}

}
