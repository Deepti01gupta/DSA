package lec24;

public class Word_Search {
	
	// https://leetcode.com/problems/word-search/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board={ { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word="ABCCED";
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[0].length; j++) {
				boolean ans=exist(board,i,j,word,0);
				if(ans==true) {
					System.out.println(ans);
					return;
				}
			}
		}
		System.out.println(false);
	}
	
	public static boolean exist(char[][] board,int cr, int cc, String word, int idx) {
		if(idx==word.length()) {
			return true;
		}
		if(cc<0 || cr<0 || cr>=board.length || cc>=board[0].length || board[cr][cc]!=word.charAt(idx)) {
			return false;
		}
		
		board[cr][cc]='*';
		int[] r= {-1,0,1,0};
		int[] c= {0,-1,0,1};
		
		for(int i=0; i<c.length; i++) {
			boolean ans=exist(board,cr+r[i],cc+c[i],word,idx+1);
			if(ans==true) {
				return true;
			}
		}
		board[cr][cc]=word.charAt(idx);
		return false;
		
	}

}
