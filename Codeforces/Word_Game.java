package Codeforces;

import java.util.*;

public class Word_Game {
	
//	https://codeforces.com/problemset/problem/1722/C

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			
			Map<String, Integer> map=new HashMap<>();
			String[][] arr=new String[3][n];
			
			for(int i=0; i<3; i++) {
				
				for(int j=0; j<n; j++) {
					arr[i][j]=sc.next();
					map.put(arr[i][j], map.getOrDefault(arr[i][j], 0)+1);
				}
			}
			
			int s1=0, s2=0, s3=0;
			
			for(String word:arr[0]) {
				if(map.get(word)==1) {
					s1+=3;
				}
				else if(map.get(word)==2) {
					s1+=1;
				}
			}
			
			for(String word:arr[1]) {
				if(map.get(word)==1) {
					s2+=3;
				}
				else if(map.get(word)==2) {
					s2+=1;
				}
			}
			
			for(String word:arr[2]) {
				if(map.get(word)==1) {
					s3+=3;
				}
				else if(map.get(word)==2) {
					s3+=1;
				}
			}
			
			System.out.println(s1+" "+s2+" "+s3);
		}
		sc.close();
	}

}
