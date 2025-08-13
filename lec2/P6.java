package lec2;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i=0;
		while(i<n) {
			int k=0;
			while(k<2*i) {
				System.out.print("  ");
				k++;
			}
			int j=0;
			while(j<n-i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}