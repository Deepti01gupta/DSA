package lec6;

import java.util.Scanner;

public class Conversion_Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int jump=sc.nextInt();
		for(int i=start; i<=end; i+=jump) {
//			int val=(int)(5/9)*(i-32); // this is wrong as (5/9)=0 then it make all result 0 by multiplying.
			int val=(int)(5*(i-32))/9;
			System.out.println(i+"	"+val);
		}
		sc.close();
	}

}
