package lec25;

public class N_Queen {

//	https://leetcode.com/problems/n-queens/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		char[][] board = new char[n][n];
		Queen_problem(board,n,0);
	}
	
	public static void Queen_problem(char[][] board, int tq, int row) {
		if(tq==0) {
			display(board);
			System.out.println();
			return;
		}
		
		for(int col=0; col<board[0].length; col++) {
			if(is_safe(board,row,col)==true) {
				board[row][col]='Q';
				Queen_problem(board,tq-1,row+1);
				board[row][col]='.';
			}
		}
	}
	
	public static boolean is_safe(char[][] board, int row, int col) {
		
		// up
		int r=row;
		while(r>=0) {
			if(board[r][col]=='Q') {
				return false;
			}
			r--;
		}
		
		// left daigonal
		r=row;
		int c=col;
		while(r>=0 && c>=0) {
			if(board[r][c]=='Q') {
				return false;
			}
			r--;
			c--;
		}
		
		// right daigonal
		r=row;
		c=col;
		while(r>=0 && c<board[0].length) {
			if(board[r][c]=='Q') {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}
	
	public static void display(char[][] board) {
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}

}
