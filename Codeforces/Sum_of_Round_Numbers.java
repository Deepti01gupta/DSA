package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sum_of_Round_Numbers {

//	https://codeforces.com/problemset/problem/1352/A
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s=sc.next();
			
			List<String> ll=new ArrayList<>();
			
			for(int i=s.length()-1; i>=0; i--) {
				if(s.charAt(i) != '0') {
					StringBuilder ans = new StringBuilder();
					ans.append(s.charAt(i));
					for(int j=i+1; j<s.length(); j++) {
						ans.append(0);
					}
					ll.add(ans.toString());
				}
			}
			
			System.out.println(ll.size());
			for(String i:ll) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}
