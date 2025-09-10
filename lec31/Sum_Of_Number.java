package lec31;

public class Sum_Of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Add(2,3));
		System.out.println(Add(2,3,5));
		System.out.println(Add(2,3,6.5));
		System.out.println(Add(2,3,4,4,2,4,5,5,6,7,4,2,4,5,3,5,4));
		
	}
	public static int Add(int a, int b) {
		return a+b;
	}
	public static int Add(int a, int b, int c) {
		return a+b+c;
	}
	public static int Add(int a, int b, double c) {
		return (int)(a+b+c);
	}
	
	public static int Add(int... ar) {
		int sum=0;
		for(int i=0; i<ar.length; i++) {
			sum+=ar[i];
		}
		return sum;
	}
}
