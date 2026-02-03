package Codeforces;

import java.util.Scanner;

public class Blank_Space {
	
//	https://codeforces.com/problemset/problem/1829/B

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int[] arr=new int[n];
			int c=0;
			int ans=0;
			for(int i=0; i<n; i++) {
				arr[i]=sc.nextInt();
				if(arr[i]==0) {
					c++;
					ans=Math.max(ans, c);
				}
				else {
					c=0;
				}
			}
			
			System.out.println(ans);
		}
		sc.close();
	}

}
