package Codeforces;

import java.util.Scanner;

public class Prepend_and_Append {

//	https://codeforces.com/problemset/problem/1791/C
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			String s=sc.next();
			
			int l=0;
			int r=n-1;
			
			while(l<=r) {
				if(s.charAt(l)!=s.charAt(r)) {
					l++;
					r--;
				}
				else {
					break;
				}
			}
			
			int ans=r-l+1;
			System.out.println(ans);
		}
		sc.close();

	}

}
