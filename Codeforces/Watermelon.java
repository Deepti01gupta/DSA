package Codeforces;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/4/A
public class Watermelon {
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans=(n%2==0 && n>2)? "YES":"NO";
        System.out.println(ans);
        sc.close();
    }

}
