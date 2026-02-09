package Codeforces;

import java.util.*;

public class Lucky_Division {

//	https://codeforces.com/problemset/problem/122/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(fun(n,0)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		sc.close();
	}
	
	private static boolean fun(int n, long v) {
		if(v!=0 && n%v==0) {
			return true;
		}
		if(v>n) {
			return false;
		}
		
		return fun(n,v*10+4) || fun(n,v*10+7);
	}

}
