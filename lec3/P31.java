package lec3;

public class P31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=n;
		while(row>0) {
			int col=n;
			while(col>0) {
				if(col==n-row+1) {
					System.out.print("* ");
				}
				else {
					System.out.print(col+" ");
				}
				col--;
			}
			System.out.println();
			row--;
		}

	}

}