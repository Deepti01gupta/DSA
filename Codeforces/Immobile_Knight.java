package Codeforces;

import java.util.Scanner;

public class Immobile_Knight {
	
//	https://codeforces.com/problemset/problem/1739/A

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			
			boolean found=false;
			
			for(int i=1; i<=n && !found; i++) {
				for(int j=1; j<=m; j++) {
					boolean flag=false;
					
					int[][] moves= {
							{2,1},{2,-1},{-2,1},{-2,-1},
							{1,2},{1,-2},{-1,2},{-1,-2}
					};
					
					for(int[] move:moves) {
						int ni=i+move[0];
						int nj=j+move[1];
						
						if(ni>=1 && ni<=n && nj>=1 && nj<=m) {
							flag=true;
							break;
						}
					}
					
					if(!flag) {
						System.out.println(i+" "+j);
						found=true;
						break;
					}
				}
			}
			if(!found) {
				System.out.println("1 1");
			}
		}
		sc.close();

	}

}
