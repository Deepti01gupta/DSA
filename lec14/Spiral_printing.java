package lec14;

import java.util.Scanner;

public class Spiral_printing {

//	https://leetcode.com/problems/spiral-matrix/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] arr=new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		spiral(arr);
		sc.close();
	}
	
	public static void spiral(int[][] arr) {
		int sr=0, sc=0, er=arr.length-1, ec=arr[0].length-1;
		int t=arr.length * arr[0].length;
		int c=0;
		while(c<t) {
			for(int j=sc; c<t && j<=ec; j++) {
				System.out.print(arr[sr][j]+" ");
				c++;
			}
			sr++;
			for(int i=sr; c<t && i<=er; i++) {
				System.out.print(arr[i][ec]+" ");
				c++;
			}
			ec--;
			for(int j=ec; c<t && j>=sc; j--) {
				System.out.print(arr[er][j]+" ");
				c++;
			}
			er--;
			for(int i=er; c<t && i>=sr; i--) {
				System.out.print(arr[i][sc]+" ");
				c++;
			}
			sc++;
		}
	}

}
