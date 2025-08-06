package lec2;

public class P20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=7;
		int row=1;
		int space1=n/2;
		int space2=0;
		while(row<=n) {
			int i=1;
			while(i<=space1) {
				System.out.print("  ");
				i++;
			}
			
			System.out.print("* ");
			
			int k=1;
			while(k<space2) {
				System.out.print("  ");
				k++;
			}
			
			if(row!=1 && row!=n) {
				System.out.print("* ");
			}
			
			if(row<=n/2) {
				space1--;
				space2+=2;
			}
			else {
				space1++;
				space2-=2;
			}
			row++;
			System.out.println();
		}
	}

}
