package lec62;

import java.util.Scanner;

public class Preparing_Olympiad {
	
//	https://codeforces.com/problemset/problem/550/B

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=sc.nextInt();
		int r=sc.nextInt();
		int x=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int ans=fun(n,l,r,x,arr);
		System.out.println(ans);
		sc.close();
	}
	
	private static int fun(int n, int l, int r, int x, int[] arr) {
		int count=0;
		
		for(int i=3; i<(1<<n); i++) {
			if(FastCountSetBit(i)>=2 & isitpossible(arr,l,r,x,i)) {
				count++;				
			}
		}
		return count;
	}
	
	private static boolean isitpossible(int[] arr, int l, int r, int x, int i) {
		int sum=0;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int idx=0;
		
		while(i>0) {
			if((i&1) ==1) {
				sum+=arr[idx];
				min=Math.min(min, arr[idx]);
				max=Math.max(max, arr[idx]);
			}
			i>>=1;
			idx++;
		}
		
		return (sum>=l & sum<=r & max-min>=x);
	}
	
	private static int FastCountSetBit(int n) {
		int ans=0;
		while(n>0) {
			ans++;
			n=n&(n-1);
		}
		return ans;
	}

}
