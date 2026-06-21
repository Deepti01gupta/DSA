package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Fox_And_Snake {

//	https://codeforces.com/problemset/problem/510/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		char[][] arr=new char[n][m];
		for(int i=0; i<n; i++) {
			Arrays.fill(arr[i],'.');
		}
		int flag=0;
		
		for(int i=0; i<n; i++) {
			if(i%2==0) {
				for(int j=0; j<m; j++) {
					arr[i][j]='#';
				}
			}
			else {
				if(flag==0) {
					arr[i][m-1]='#';
					
				}
				else {
					arr[i][0]='#';
				}
				flag=1-flag;
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
	}

}
