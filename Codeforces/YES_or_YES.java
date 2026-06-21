package Codeforces;

import java.util.Scanner;

public class YES_or_YES {
	
//	https://codeforces.com/problemset/problem/1703/A

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			String s=sc.next().toLowerCase();
			if(s.equals("yes")) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		
		sc.close();

	}

}
