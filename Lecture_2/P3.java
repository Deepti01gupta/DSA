package lec2;

public class P3 {
	public static void main(String[] args) {
		int n=5;
		int row=1;
		while(row<=n) {
			int j=0;
			while(j<=n-row) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			row++;
		}
	}
}