package lec19;

public class Coin_Toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		System.out.println(toss(n,""));
	}
	
	public static int toss(int n, String ans) {
		if(ans.length()==n) {
			System.out.println(ans);
			return 1;
		}
		
		int x=0;
		x+=toss(n,ans+'H');
		x+=toss(n,ans+'T');
		return x;
	}

}
