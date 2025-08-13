package lec7;

public class Fun_Demo_1 {

	// java k program JVM(java virtual machine) run krwata hai
	
	// public static void main():
	// isme public h mtlb h ye sabko excess hai
	// main ek method h jo sabse phele run hota hai
	// void function h return type hai mtlb ye function kuch return nahi kr rha hai
	// jvm koi class nahi h ki static object banake main function ko call kre
	// main function ke upar or sare function k stack banenge
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Add();
		System.out.println("bye");
	}
	public static void Add() {
		int a=9;
		int b=7;
		int c=a+b;
		int x=Sub();
		System.out.println(c-x);
	}
	public static int Sub() {
		int a=9;
		int b=7;
		int c=a-b;
//		System.out.println(c);
		return c;
	}

}
