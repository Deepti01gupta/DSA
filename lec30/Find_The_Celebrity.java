package lec30;

import java.util.*;

public class Find_The_Celebrity {

//	https://leetcode.ca/all/277.html
//	https://leetcode.com/problems/find-the-celebrity/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
		System.out.println(Celebrity(arr));
	}
	
	public static int Celebrity(int[][] arr) {
		Stack<Integer> st=new Stack<>();
		for(int i=0; i<arr.length; i++) {
			st.push(i);
		}
		
		while(st.size()>1) {
			int a=st.pop();
			int b=st.pop();
			if(arr[a][b]!=1 && arr[b][a]==1) {
				st.push(a);
			}
			else {
				st.push(b);
			}
		}
		int idx=st.pop();
		for(int i=0; i<arr.length && i!=idx ; i++) {
			if(arr[idx][i] == 1 || arr[i][idx] == 0) {
				return -1;
			}
		}
		return idx;
	}

}
