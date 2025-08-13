package lec3;

public class P27 {

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
			
			int i=1;
			while(i<=row) {
				System.out.print(i+" ");
				i++;
			}
			
			int k=row-1;
			while(k>0) {
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
			row++;
		}
	}

}