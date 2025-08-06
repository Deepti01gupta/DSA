package lec3;

public class P30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		while(row<=n) {
			int col=n;
			while(col>0) {
				System.out.print(col+" ");
				col--;
			}
			System.out.println();
			row++;
		}
	}
}