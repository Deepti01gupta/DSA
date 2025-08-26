package lec18;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=2;
		int b=5;
		System.out.println(pow(a,b));
	}
	
	public static int pow(int a, int b) {
		if(b==0) {
			return 1;
		}
		return a*pow(a,b-1);
	}

}
