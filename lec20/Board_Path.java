package lec20;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		System.out.println(path(n,"", 0));
	}
	
	public static int path(int n, String ans, int sum) {
		if(sum==n) {
			System.out.println(ans);
			return 1;
		}
		if(sum>n) {
			return 0;
		}
		int x=0;
		for(int i=1; i<=6; i++) {
			x+=path(n,ans+i,sum+i);
		}
		return x;
	}

}
