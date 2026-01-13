package lec60;

public class Left_Shift {  // a<<n= a*2^n

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		System.out.println(n<<1);
		int n1=-13;
		System.out.println(n1<<1);
//		byte b=-128;
//		b=(byte)(b<<1);
//		System.out.println(b);
		
		n=Integer.MIN_VALUE<<1;
		System.out.println(n);
		
	}

}
