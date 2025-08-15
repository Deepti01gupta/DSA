package lec11;

import java.util.Scanner;

public class Kth_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);;
		int n=sc.nextInt();
		int k=sc.nextInt();
		int x=search(n,k);
		System.out.println(x);
		sc.close();
	}
	
	// x^k<=n
	public static int search(int n, int k) {
		int lo=0;
		int hi=n;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(Math.pow(mid, k)<=n) {
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return lo;
	}
}
