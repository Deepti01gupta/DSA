package Codeforces;

import java.util.*;

//https://codeforces.com/problemset/problem/231/A
public class Team {

	public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       int ans=0;
	       while(n-->0){
	           int a=sc.nextInt();
	           int b=sc.nextInt();
	           int c=sc.nextInt();
	           int t=a+b+c;
	           if(t>=2){
	               ans++;
	           }
	       }
	       System.out.println(ans);
	       sc.close();
	    }
	
}
