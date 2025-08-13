package lec2;

public class P16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i=1;
		while(i<=n) {
			int k=1;
			while(k<=n-i) {
				System.out.print("   ");
				k++;
			}
			int j=0;
			while(j<=n-i) {
				System.out.print("*  ");
				j++;
			}
			System.out.println();
			i++;
		}
		
		int p=n-1;
		while(p>0) {
			int k=1;
			while(k<=n-p) {
				System.out.print("   ");
				k++;
			}
			int j=0;
			while(j<=n-p) {
				System.out.print("*  ");
				j++;
			}
			System.out.println();
			p--;
		}
	}

}