package lec1;

public class Minimum_of_three_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=30;
		if(a<b && a<c) {
			System.out.println(a);
		}
		else if(b<c && b<a) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}

}
