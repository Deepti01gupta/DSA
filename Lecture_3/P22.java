package lec3;

public class P22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int row=1;
		while(row<=n) {
			int star1=1;
			while(star1<=n-row+1) {
				System.out.print("*  ");
				star1++;
			}
			
			int space=1;
			while(space<2*row-2) {
				System.out.print("   ");
				space++;
			}
			
			int star2=1;
			if(row==1) {
				star2=2;
			}
			while(star2<=n-row+1) {
				System.out.print("*  ");
				star2++;
			}
			
			System.out.println();
			row++;
		}
	}

}