package BootCamp;

import java.util.*;

public class no_of_island {
	
	public static int noOfIsland(int[][] arr) {
		int n=arr.length;
		int m=arr[0].length;
		boolean[][] vis=new boolean[n][m];
		int ans=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j]==1) {
					ans++;
					dfs(arr,i,j,vis);
				}
			}
		} 
		return ans;
	}
	
	public static void dfs(int[][] arr, int i, int j, boolean[][] vis) {
		int[] row= {1,-1,0,0};
		int[] col= {0,0,1,-1};
		Stack<int[]> st=new Stack<>();
		st.push(new int[] {i,j});
		while(!st.isEmpty()) {
			int[] rv=st.pop();
			int r=rv[0];
			int c=rv[1];
			
			vis[r][c]=false; 
			
			for(int a=0; a<4; a++) {
				int nr=row[a]+r;
				int nc=col[a]+c;
				if(nr>=0 && nr<arr.length && nc>=0 && nc<arr[0].length && arr[nr][nc]==1) {
					st.push(new int[] {nr,nc});
					arr[nr][nc]=0;
				}
			}
			
		}
	}
}
