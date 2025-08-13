package lec3;
public class P24 {

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
				System.out.print(row+"  ");
				star++;
			}
			System.out.println();
			row++;
		}
	}

}