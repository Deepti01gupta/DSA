package lec2;

public class P17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=7;
		int row1=1;
		while(row1<=(n/2)+1) {
			int star1=0;
			while(star1<=(n/2)-row1) {
				System.out.print("*  ");
				star1++;
			}
			
			int space=1;
			while(space<=2*row1-1) {
				System.out.print("   ");
				space++;
			}
			
			int star2=0;
			while(star2<=(n/2)-row1) {
				System.out.print("*  ");
				star2++;
			}
			
			System.out.println();
			row1++;
		}
		
		
		int row2=n/2;
		while(row2>0) {
			int star1=0;
			while(star1<=(n/2)-row2) {
				System.out.print("*  ");
				star1++;
			}
			
			int space=1;
			while(space<=2*row2-1) {
				System.out.print("   ");
				space++;
			}
			
			int star2=0;
			while(star2<=(n/2)-row2) {
				System.out.print("*  ");
				star2++;
			}
			
			System.out.println();
			row2--;
		}
		
		
	}

}