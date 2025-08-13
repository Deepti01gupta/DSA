package lec1;

public class Grade_Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=48;
		if(marks>=75) {
			System.out.println("A");
		}
		else if( 65<=marks && marks<75) {
			System.out.println("B");
		}
		else if(55<=marks && marks<65) {
			System.out.println("C");
		}
		else if(45<=marks && marks<55) {
			System.out.println("D");
		}
		else {
			System.out.println("Fail");
		}
	}

}
