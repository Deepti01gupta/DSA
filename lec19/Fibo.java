package lec19;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=9;
		System.out.println(fibo(n));
	}
	
	// TC : O(2^(log N)) 
	public static int fibo(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}

}
