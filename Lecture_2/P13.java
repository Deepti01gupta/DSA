package lec2;


public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int star=1;
		int row=1;
		while(row<=2*n-1) {
			
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			if(row<n) {
				star++;
			}
			else {
				star--;
			}
			System.out.println();
			row++;
		}
		
		
		
		
		
		
		
		
		
//		int i=1;
//		while(i<=n) {
//			int j=1;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		int k=n-1;
//		while(k>0) {
//			int j=1;
//			while(j<=k) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			k--;
//		}

	}

}
