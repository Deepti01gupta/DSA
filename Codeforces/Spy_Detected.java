package Codeforces;

import java.util.Scanner;

public class Spy_Detected {

//	https://codeforces.com/problemset/problem/1512/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			for(int i=0; i<n; i++) {
				arr[i]=sc.nextInt();
			}
			
			System.out.println(solve(arr));
		}
		sc.close();

	}
	
	public static int solve(int[] arr) {
		int ele1=0;
		int c1=1;
		int ele2=-1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]==arr[ele1]) {
				c1++;
			}
			else {
				if(ele2==-1){
                    ele2=i;
                } 
                else if(arr[i]==arr[ele2]){
                }
			}
		}
		
		if(c1==1) return ele1+1;
		return ele2+1;
	}

}
