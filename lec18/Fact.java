package lec18;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(fact(n));
	}
	
	public static int fact(int n) {
		// base case
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
	}

}
