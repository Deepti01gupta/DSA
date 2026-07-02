package Codeforces;

import java.util.Scanner;

public class Holiday_Of_Equality {

//	https://codeforces.com/problemset/problem/758/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int max=0;
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
			max=Math.max(max, arr[i]);
		}
		
		int ans=0;
		for(int i:arr) {
			ans+=Math.abs(i-max);
		}
		
		System.out.println(ans);
		sc.close();
	}

}
