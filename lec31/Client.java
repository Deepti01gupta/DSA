package lec31;

public class Client {
	
	//	LHS				RHS
	//	P obj			new P()
	//	P obj			new C()
	//	C obj			new P()
	//	C obj			new C()

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CASE 1
//		P obj=new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d2);
//		obj.fun();
//		obj.fun2();
		
		
		// CASE 2 : obj P k ban rha h to sare value P k excess hote h
//		P obj=new C();
//		System.out.println(obj.d);
//		System.out.println(obj.d2);
//		System.out.println(((C)(obj)).d1);// type casting
//		obj.fun(); // parent main fun bana hua hai but jaise hi ham naya fun banayenge to parent wala fun update ho jayega or new wala fun run krega
//		obj.fun2();
//		((C)(obj)).fun1(); // type cast
		
		
		// CASE 3  No such case exist as P cannot excess C
//		C obj=new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(obj.d2);
		
		
		// CASE 4 
		C obj=new C();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		System.out.println(((P)(obj)).d);
		obj.fun();
		obj.fun1();
		obj.fun2();
		((P)(obj)).fun();
	}

}

// compile time error is better than run time error
