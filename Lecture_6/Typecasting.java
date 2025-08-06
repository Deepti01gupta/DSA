package lec6;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=047;   // number get converted into base 8(0-7)
//		int b=049;   // number is wrong as in base 8 9 is not valid
//		System.out.println(a);
		
		
		// explicit type casting
//		byte b=14;
//		byte b2=140; // out of range of byte 
		byte b3=(byte)140;  // this is the correct way
		System.out.println(b3);  // b3 ko byte m type caste kr diya store krne k liye to uski jo decimal value aayegi vo print hogi
		byte b1=(byte)(300);  // peeche ki 8 bit use hongi type casting k baad usko hi decimal m convert kr denge
		System.out.println(b1);
		byte b4=(byte)(428);
		System.out.println(b4);
		
		// inplicit type casting
		byte c1=42;
		System.out.println(c1);
		
		byte d=2;
		int i=17;
		i=d; // d ko decimal m convert krke store krenge
		d=-5; 
		i=d;  // d negative h to phele iska 2s compliment krke decimal convert krenge phir i m store krenge
		System.out.println(i);
		
		// hard code krte time litral m l ko add krenge number ko long banane ke liye.
		long l=2454525445l;
		System.out.println(l);
	}

}
