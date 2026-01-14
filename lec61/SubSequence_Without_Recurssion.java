package lec61;

public class SubSequence_Without_Recurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		subsequence(s);

	}
	
	private static void subsequence(String s) {
		int n=s.length();
		
		for(int i=0; i<(1<<n); i++) {   // (i<<n) = 1*(2^n)
			pattern(s,i);
		}
	}
	
	private static void pattern(String s, int i) {
		int idx=0;
		String ans="";
		while(i>0) {
			if((i&1)==1) {
				ans=ans+s.charAt(idx);
			}
			idx++;
			i=i>>1;
		}
		System.out.println(ans);
	}

}
