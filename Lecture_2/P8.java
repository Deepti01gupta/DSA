package lec2;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i=0;
		while(i<5) {
			int j=0;
			while(j<n) {
				if(i==j || (i+j)%4==0) {
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