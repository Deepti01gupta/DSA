package lec6;

public class Loops_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// infinite loop chalega 
		// jaise hi 128 hoga to vo byte m type caste hoga -128 m or phirse loop chalne lagega
		for(byte i=0; i<128; i++) {
			System.out.println(i);
		}
		
		// same as above case
		for(byte i=0; i<=127; i++) {
			System.out.println(i);
		}
		
		
		// this will print from 0 to 126
		for(byte i=0; i<127; i++) {
			System.out.println(i);
		}
	}

}
