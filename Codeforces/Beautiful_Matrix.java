package Codeforces;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/263/A
public class Beautiful_Matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=5;
		int r=0, c=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				int x=sc.nextInt();
				if(x==1) {
					r=i;
					c=j;
				}
			}
		}
		
		int ans=Math.abs(r-2)+Math.abs(c-2);
		System.out.println(ans);
		sc.close();
	}
}
