package lec27;

public class Sieve_Of_Eratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=100;
		prime_sieve(n);
	}
	
//	false = prime idx hai
//	true = prime idx nahi hai
	public static void prime_sieve(int n) {
		boolean[] arr=new boolean[n+1];
		
		arr[0]=true;
		arr[1]=true;
		
		for(int i=2; i<n; i++) {
			if(arr[i]==false) {
				for(int j=2; i*j<arr.length; j++) {
					arr[i*j]=true;
				}
			}
		}
		
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == false) {
				System.out.print(i + " ");
			}
		}
	}

}
