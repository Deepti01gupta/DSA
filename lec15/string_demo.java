package lec15;

public class string_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		String s4 = new String("hello");
		
		System.out.println(s1 == s2); // true → same reference from String Pool
		System.out.println(s1 == s3); // false → s3 is a new object in heap
		System.out.println(s1 == s4); // false → s4 is a new object in heap

		int[] arr = new int[5];
		System.out.println(arr.length); // 5 → array size
		System.out.println(s1.length()); // 5 → "hello" has 5 characters

	}

}


// SP (string poll) / IP (intern poll) : new keyword k use nahi krte hai to string sp/ip main banta hai .

/* agar ham sp/ip main koi same string dalte hai to vo phele se jo string h uska address hi alot kr deti h 
 * koi new string create nahi hoti h kyuki sp/ip duplicate string nahi rakhte hai */ 

// new keyword use krte hai to ham baar new address pr string create hogi.

