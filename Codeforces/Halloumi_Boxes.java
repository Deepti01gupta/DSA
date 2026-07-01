package Codeforces;

import java.util.Scanner;

public class Halloumi_Boxes {

//	https://codeforces.com/problemset/problem/1903/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			
			int[] arr=new int[n];
			for(int i=0; i<n; i++) {
				arr[i]=sc.nextInt();
			}
			
			if(k>1) {
				System.out.println("YES");
			}
			else {
				boolean flag=true;
				
				for(int i=1; i<n; i++) {
					if(arr[i]<arr[i-1]) {
						flag=false;
						break;
					}
				}
				
				System.out.println(flag? "YES":"NO");
			}
		}
		sc.close();
	}

}
