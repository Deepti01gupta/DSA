package lec11;

import java.util.Scanner;

public class First_Bad_Version {

//	https://leetcode.com/problems/first-bad-version/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);;
		int n=sc.nextInt();
		int x=version(n);
		System.out.println(x);
		sc.close();
	}
	
	// x^k<=n
	public static int version(int n) {
		int lo=0;
		int hi=n;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(isBadVersion(mid)==true) {
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return lo;
	}
	
	public static boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}
}
