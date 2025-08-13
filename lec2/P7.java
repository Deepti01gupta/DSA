package lec2;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i=0;
		while(i<n) {
			int j=0;
			while(j<n) {
				if(i==0 || i==n-1 || j==0 || j==n-1) {
					System.out.print("*  ");
				}
				else {
					System.out.print("   ");
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}

}