package lec14;

import java.util.Scanner;

public class Search_a_2D_Matrix_II {

//	https://leetcode.com/problems/search-a-2d-matrix-ii/description/
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
		int t=sc.nextInt();
		System.out.println(search(arr,t));
		sc.close();
	}
	
	public static boolean search(int[][] arr, int t) {
		int i=0;
		int j=arr[0].length-1;
		while(i<arr.length && j>=0) {
			if(arr[i][j]==t) {
				return true;
			}
		    else if(arr[i][j]>t) {
				j--;
			}
			else {
				i++;
			}
		}
		return false;
	}

}
