package lec3;

public class P29 {

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
			
			int i=row;
			while(i<2*row) {
				if(i==row) {
					System.out.print(row+" ");
				}
				else {
					System.out.print(0+" ");
				}
				i++;
			}
			
			int j=1;
			while(j<row) {
				if(j==row-1) {
					System.out.print(row+" ");
				}
				else {
					System.out.print(0+" ");
				}
				j++;
			}
			System.out.println();
			row++;
		}
	}

}