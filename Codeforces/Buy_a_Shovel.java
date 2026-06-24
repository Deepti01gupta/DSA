package Codeforces;

import java.util.Scanner;

public class Buy_a_Shovel {

//	https://codeforces.com/problemset/problem/732/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int r=sc.nextInt();
		
		for(int n=1; n<=10; n++) {
			int last=(k*n)%10;
			
			if(last==0 || last==r) {
				System.out.println(n);
				sc.close();
				return;
			}
		}
		sc.close();
	}

}
