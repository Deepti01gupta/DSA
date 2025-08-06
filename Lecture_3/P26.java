package lec3;

public class P26 {

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
			
			int j=1;
			while(j<=2*row-1) {
				System.out.print(j+" ");
				j++;
			}
			
			System.out.println();
			row++;
			
		}

	}

}