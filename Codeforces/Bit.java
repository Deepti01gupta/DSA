package Codeforces;

import java.util.*;

//https://codeforces.com/problemset/problem/282/A
public class Bit {

	public static void main(String[] args) {
	       Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       int ans=0;
	       while(n-->0){
	           String s=sc.next();
	           if(s.charAt(1)=='-'){
	               ans--;
	           }
	           else{
	               ans++;
	           }
	       }
	       System.out.println(ans);
	       sc.close();
	    }
	
}


