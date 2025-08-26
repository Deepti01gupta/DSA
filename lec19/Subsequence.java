package lec19;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abc";
		int ans=subseq(s,"");
		System.out.println(ans);
	}
	
	public static int subseq(String s, String ans) {
		if(s.length()==0) {
			System.out.println(ans);
			return 1;
		}
		int x=0;
		x+=subseq(s.substring(1),ans);
		x+=subseq(s.substring(1),ans+s.charAt(0));
		return x;
	}

}
