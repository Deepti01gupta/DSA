package lec1;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		int c=0;
		for(int i=2; i<n/2; i++) {
			if(n%i==0) {
				c++;
				break;
			}
		}
		if(c==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}

	}

}
