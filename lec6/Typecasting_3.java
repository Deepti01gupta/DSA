package lec6;

import java.util.Scanner;

public class Typecasting_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a=97, A=63
		char ch='a';
		System.out.println(ch);
		System.out.println((int)(ch));
		
		// implicit typecasting
		ch++;  // ch = (char)(ch+1);  
		System.out.println(ch);
		
		// explicit typecasting
		ch=(char)(ch+1);
		System.out.println(ch);
		
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		System.out.println(c);
		
		sc.close();
	}

}
