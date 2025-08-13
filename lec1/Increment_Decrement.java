package lec1;

public class Increment_Decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// post increment
		int a = 6;
		System.out.println(a++);
		System.out.println(a);

		// post decrement
		int b = 11;
		System.out.println(b--);
		System.out.println(b);

		a = 6;
		int x = a++ + 6 + a-- - a-- + a++ - a++;
		System.out.println(x);

		a = 6;
		x = a-- + 7 + a-- + 8 + a++;
		System.out.println(x);

		// post increment
		int c = 10;
		System.out.println(++c);
		System.out.println(c);

		// post decrement
		int d = 19;
		System.out.println(--d);
		System.out.println(d);
		
		a=6;
		a=a++ + --a - ++a + 11 + a++ - a-- + ++a;
		System.out.println(a);
	}

}
