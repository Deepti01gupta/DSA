package Codeforces;

import java.util.Scanner;

public class Division {

//	https://codeforces.com/problemset/problem/1669/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int rate=sc.nextInt();
			if(rate<=1399) {
				System.out.println("Division 4");
			}
			else if(1400<=rate && rate<=1599) {
				System.out.println("Division 3");
			}
			else if(1600<=rate && rate<=1899) {
				System.out.println("Division 2");
			}
			else if(1900<=rate) {
				System.out.println("Division 1");
			}
		}
		
		sc.close();
	}

}
