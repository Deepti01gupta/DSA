package lec16;

public class wrapper_class_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		Integer a1 = 91;
		System.out.println(a);
		System.out.println(a1);
		// auto-boxing : primitive data ko uske coresponding non primitive data main assign krna
		a1 = a;
		
		int b = 11;
		Integer b1 = 189;
		// un-boxing : non primitive data ko uske corresponding primitive data main assgin krna
		b = b1;
		System.out.println(b);

		Integer c1 = 18;
		Integer c2 = 18;
		Integer c3 = 189;
		Integer c4 = 189;
		System.out.println(c1 == c2);  // true
		System.out.println(c3 == c4);  // false 
		// because cache ki range -128 to 127 hoti h to c1, c2 ko same address diya h
		// jabki c3, c4 ko alag alag address dete hai 
		
	}
}
