package lec15;

public class string_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";   // poll main banti h
		String s2="bye";   // poll main banti hai
		String s=s1+s2;
		String s4="kaju"+s1;
		String s5="kaju"+"katli";	// poll main banti h
		String s3=s1.concat(s2);
		System.out.println(s);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println("hey"+10+30+"bye"+4+2);
		System.out.println(2+3+"bye"+5+5);
		System.out.println("hey"+(10+30)+"bye"+4+2);
	}

}


// string is java is immutable : string main changes hoga but same location pr nahi hoga
// example: s=s1+"bye" , isme phele s1 ki copy banegi heap m kahi phir usme "bye" add hoga or phir uss ka address s m store hoga
// mtlb s1 ki location m changes nhi honge ek naya address banega s ke liye 


// jba ham string ko contact krte hai to ans string poll k bahar banti hai
// kyuki new keyword internally chal jata hai.

// agar ham do string jo directly di gai h unhe concat krte hai to vo poll main hi banti h

// baki koi bhi case ho string k sab heap main hoti h.