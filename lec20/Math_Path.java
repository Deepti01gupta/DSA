package lec20;

public class Math_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=3;
		int m=3;
		path(n-1,m-1,0,0,"");
	}
	
	public static void path(int er, int ec, int cr, int cc, String ans) {
		if(cc==ec && cr==er) {
			System.out.println(ans);
			return;
		}
		if(cc>ec || cr>er) {
			return;
		}
		path(er,ec,cr+1,cc,ans+'V');
		path(er,ec,cr,cc+1,ans+'H');
	}

}
