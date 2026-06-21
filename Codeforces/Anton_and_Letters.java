package Codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Anton_and_Letters {
	
//	https://codeforces.com/problemset/problem/443/A 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Set<Character> st=new HashSet<>();
		
		for(char ch:s.toCharArray()) {
			if(Character.isLetter(ch)){
                st.add(ch);
            }
		}
		
		System.out.println(st.size());
		
		sc.close();
	}

}
