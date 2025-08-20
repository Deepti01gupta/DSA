package lec15;

public class string_lexcographical_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="komal";
		String s2="kunal";
		System.out.println(s1.compareTo(s2));
		
		// +ve : s1>s2
		// -ve : s2>s1
		// 0 : s1==s2
		System.out.println(compareto(s1,s2));
	}
	
	public static int compareto(String s1, String s2) {
		if(s1==s2) {
			return 0;
		}
		for(int i=0; i<Math.min(s1.length(), s2.length()); i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return s1.charAt(i)-s2.charAt(i);
			}
			
		}
		return s1.length()-s2.length();
	}

}
