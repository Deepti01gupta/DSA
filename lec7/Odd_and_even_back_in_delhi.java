package lec7;

import java.util.Scanner;

public class Odd_and_even_back_in_delhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			if(sum_of_even(n)%4==0 || sum_of_odd(n)%3==0) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
		sc.close();
	}
	public static int sum_of_even(int n) {
		int sum=0;
		while(n>0) {
			int r=n%10;
			if(r%2==0) {
				sum+=r;
			}
			n/=10;
		}
		return sum;
	}
	public static int sum_of_odd(int n) {
		int sum=0;
		while(n>0) {
			int r=n%10;
			if(r%2!=0) {
				sum+=r;
			}
			n/=10;
		}
		return sum;
	}

}
