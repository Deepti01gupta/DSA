package lec17;

public class Kartik_Bhaiya_And_Strings {

//	https://codeskiller.codingblocks.com/problems/446
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=2;
		String s="abbababbabbaaa";
		int a1=maxlen(s,k,'a');
		int a2=maxlen(s,k,'b');
		int ans=Math.max(a1, a2);
		System.out.println(ans);
	}
	
	public static int maxlen(String s, int k, char ch) {
		int ans=0;
		int si=0;
		int ei=0;
		int flip=0;
		while(ei<s.length()) {
			
			// grow
			if(ch==s.charAt(ei)) {
				flip++;
			}
			
			// shrink
			while(flip>k) {
				if(ch==s.charAt(si)) {
					flip--;
				}
				si++;
			}
			
			// cal
			ans=Math.max(ans, ei-si+1);
			ei++;
		}
		return ans;
	}

}
