package lec24;

import java.util.*;

public class Rat_Chasrs_its_cheese {

//	https://codeskiller.codingblocks.com/problems/535
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char[][] arr=new char[n][m];
		for(int i=0; i<n; i++) {
			String str=sc.next();
			for(int j=0; j<str.length(); j++) {
				arr[i][j]=str.charAt(j);
			}
		}
		int[][] ans=new int[n][m];
		print_path(arr,0,0,ans);
		if(val==false) {
			System.out.println("NO PATH FOUND");
		}
		sc.close();
	}
	
	static boolean val=false;
	
	public static void print_path(char[][] grid, int cr, int cc, int[][] ans) {
		if(cc<0 || cr<0 || cr>=grid.length || cc>=grid[0].length || grid[cr][cc]=='X') {
			return;
		}
		
		if(cr==grid.length-1 && cc==grid[0].length-1 && grid[cr][cc]=='O') {
			ans[cr][cc]=1;
			val=true;
			display(ans);
		}
		
		grid[cr][cc]='X';
		ans[cr][cc]=1;
		
		int[] r= {-1,0,1,0};
		int[] c= {0,-1,0,1};
		
		for(int i=0; i<c.length; i++) {
			print_path(grid,cr+r[i],cc+c[i],ans);
		}
		
		grid[cr][cc]='O';
		ans[cr][cc]=0;
		
	}
	

	public static void display(int[][] ans) {
		for(int i=0; i<ans.length; i++) {
			for(int j=0; j<ans[0].length; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}


}
