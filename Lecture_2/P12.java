package lec2;

public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		while(row<=n) {
			int space=1;
			while(space<=n-row) {
				System.out.print("  ");
				space++;
			}
			int star=1;
			while(star<=2*row-1) {
				if(star%2==0) {
					System.out.print("! ");
				}
				else {
					System.out.print("* ");
				}
				star++;
			}
			System.out.println();
			row++;
		}
	}
}