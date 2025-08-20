package lec16;

import java.util.Scanner;

public class print_substring_length_wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		substring_lengthwise(s);
		sc.close();
	}
	public static void substring_lengthwise(String s) {
		int n=s.length();
		for(int len=1; len<=n; len++) {
			for(int j=len; j<=n; j++) {
				int i=j-len;
				System.out.println(s.substring(i,j));
			}
		}
	}

}
