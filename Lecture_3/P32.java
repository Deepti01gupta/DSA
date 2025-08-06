package lec3;

public class P32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star=1;
		int k=1;
		while(row<2*n) {
			int i=1;
			while(i<=star) {
				if(i%2!=0) {
					System.out.print(k+" ");
				}
				else {
					System.out.print("* ");
				}
				i++;
			}
			if(row<n) {
				star+=2;
				k++;
			}
			else {
				star-=2;
				k--;
			}
			System.out.println();
			row++;
		}
		
		
		
		
//		int row1=1;
//		while(row1<=n) {
//			int j=1;
//			while(j<2*row1) {
//				if(j%2==1) {
//					System.out.print(row1+" ");
//				}
//				else {
//					System.out.print("* ");
//				}
//				j++;
//			}
//			System.out.println();
//			row1++;
//		}
//		
//		
//		int row2=n-1;
//		while(row2>0) {
//			int j=1;
//			while(j<2*row2) {
//				if(j%2==1) {
//					System.out.print(row2+" ");
//				}
//				else {
//					System.out.print("* ");
//				}
//				j++;
//			}
//			System.out.println();
//			row2--;
//		}

	}

}