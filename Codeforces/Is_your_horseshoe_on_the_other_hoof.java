package Codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Is_your_horseshoe_on_the_other_hoof {

//	https://codeforces.com/problemset/problem/228/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Set<Integer> st=new HashSet<>();
		
		for(int i=0; i<4; i++) {
			int v=sc.nextInt();
			st.add(v);
		}
		
		System.out.println(4-st.size());
		sc.close();
	}

}
