package lec6;

import java.util.Scanner;

public class Typecasting_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f=8.9f;  // f=(float)(8.9)
		double d=8.9;
		Scanner sc=new Scanner(System.in);
		f=sc.nextFloat();
		d=sc.nextDouble();
		System.out.println(f);
		System.out.println(d);
		
		sc.close();
	}

}
