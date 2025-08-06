package lec2;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int star=1;
		int row=1;
		int space=n-1;
		while(row<=2*n-1) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			
			if(row<n) {
				space--;
				star++;
			}
			else {
				space++;
				star--;
			}
			System.out.println();
			row++;
		}
		
		
		
		
		
		
		
		
		
		
		
//		int i=1;
//		while(i<=n) {
//			int k=1;
//			while(k<=n-i) {
//				System.out.print("  ");
//				k++;
//			}
//			int j=1;
//			while(j<=i) {
//				System.out.print("* ");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		int p=n-1;
//		while(p>0) {
//			int k=1;
//			while(k<=n-p) {
//				System.out.print("  ");
//				k++;
//			}
//			int j=1;
//			while(j<=p) {
//				System.out.print("* ");
//				j++;
//			}
//			System.out.println();
//			p--;
//		}
		
	}

}