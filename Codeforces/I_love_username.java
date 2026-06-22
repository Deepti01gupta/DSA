package Codeforces;

import java.util.Scanner;

public class I_love_username {
	
//	https://codeforces.com/problemset/problem/155/A

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int min=arr[0];
		int max=arr[0];
		int ans=0;
		
		for(int i=1; i<n; i++) {
			if(arr[i]>max) {
				ans++;
				max=arr[i];
			}
			else if(arr[i]<min){
				ans++;
				min=arr[i];
			}
		}
		
		System.out.println(ans);
		sc.close();
	}

}
