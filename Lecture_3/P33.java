package lec3;

public class P33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int row=1;
		int space=n;
		int star=n;
		while(row<=n) {
			int i=1;
			while(i<space) {
				System.out.print("  ");
				i++;
			}
			
			int j=star;
			while(j<n) {
				System.out.print(j+" ");
				j++;
			}
			
			System.out.print(0+" ");
			
			int k=n-1;
			while(k>=star) {
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
			row++;			
			space--;
			star--;
		}
	}
}