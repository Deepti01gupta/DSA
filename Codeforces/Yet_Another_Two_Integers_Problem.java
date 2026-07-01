package Codeforces;

import java.util.Scanner;

public class Yet_Another_Two_Integers_Problem {

//	https://codeforces.com/problemset/problem/1409/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			int diff=Math.abs(a-b);
		    int ans=(diff + 9) / 10;
		    
		    System.out.println(ans);
		}
		sc.close();
	}

}
