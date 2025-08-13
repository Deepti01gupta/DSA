package lec2;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i=5;
		while(i>=1) {
			int k=1;
			while(k<=n-i) {
				System.out.print("  ");
				k++;
			}
			int j=1;
			while(j<=i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i--;
		}
	}

}