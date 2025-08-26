package lec21;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abc";
		System.out.println(per(s,""));
	}
	public static int per(String s, String ans) {
		if(s.length()==0) {
			System.out.println(ans);
			return 1;
		}
		int x=0;
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			String s1=s.substring(0,i);
			String s2=s.substring(i+1);
			x+=per(s1+s2,ans+ch);
		}
		
		return x;
	}
	

}
