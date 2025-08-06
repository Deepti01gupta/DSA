package lec3;

public class P28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		while(row<=n) {
			int space=row;
			while(space<n) {
				System.out.print("  ");
				space++;
			}
			
			int i=row;
			while(i<=2*row-1) {
				System.out.print(i+" ");
				i++;
			}
			 
			int j=1; 
			int k=row*2-2;
			while(j<row) {
				System.out.print(k+" ");
				j++;
				k--;
			}
			
			System.out.println();
			row++;
		}
	 }

}



//        1
//      2 3 2
//    3 4 5 4 3
//  4 5 6 7 6 5 4
//5 6 7 8 9 8 7 6 5