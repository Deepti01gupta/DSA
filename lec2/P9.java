package lec2;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		while(row<=n) {
			int space=1;
			while(space<=n-row) {
				System.out.print("   ");
				space++;
			}
			int star=1;
			while(star<=2*row-1) {
				System.out.print("*  ");
				star++;
			}				
			System.out.println();
			row++;
		}
	}

}
