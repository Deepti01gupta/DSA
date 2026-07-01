package Codeforces;

import java.util.Scanner;

public class How_Much_Does_Daytona_Cost {

//	https://codeforces.com/problemset/problem/1878/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			boolean flag=false;
			
			int[] arr=new int[n];
			for(int i=0; i<n; i++) {
				arr[i]=sc.nextInt();
				if(arr[i]==k) {
					flag=true;
				}
			}
			
			if(flag) System.out.println("YES");
			else System.out.println("NO");
		}
		sc.close();

	}

}
