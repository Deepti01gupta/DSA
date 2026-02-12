package lec68;

import java.util.*;

public class Maximum_XOR_With_an_Element_From_Array {

//	https://leetcode.com/problems/maximum-xor-with-an-element-from-array/
	
	static class Trie{
		class Node{
			Node zero;
			Node one;
			
		}
		
		private Node root=new Node();
		
		public void add(int val) {
			Node cur=root;
			
			for(int i=31; i>=0; i--) {
				int bit=val & (1<<i);
				if(bit==0) {
					if(cur.zero!=null) {
						cur=cur.zero;
					}
					else {
						Node nn=new Node();
						cur.zero=nn;
						cur=nn;
					}
				}
				else {
					if(cur.one!=null) {
						cur=cur.one;
					}
					else {
						Node nn=new Node();
						cur.one=nn;
						cur=nn;
					}
				}
			}
		}
		
		public int getMaxXor(int x) {
			int ans=0;
			Node cur=root;
			for(int i=31; i>=0; i--) {
				int bit=x & (1<<i);
				if(bit==0) {
					if(cur.one!=null) {
						ans=ans | (1<<i);
						cur=cur.one;
					}
					else {
						cur=cur.zero;
					}
				}
				else {
					if(cur.zero!=null) {
						ans=ans | (1<<i);
						cur=cur.zero;
					}
					else {
						cur=cur.one;
					}
				}
			}
			return ans;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,3,4};
		int[][] queries= {{3,1},{1,3},{5,6}};
		int n=queries.length;
		int[][] q=new int[n][3];
	
		for(int i=0; i<n; i++) {
			q[i][0]=queries[i][0];
			q[i][1]=queries[i][1];
			q[i][2]=i;
		}
		
		Arrays.sort(q,(a,b)->a[1]-b[1]);
		Arrays.sort(arr);
		
		int[] ans=new int[n];
		Trie t=new Trie();
		int j=0;
		for(int[] a:q) {
			while(j<n && arr[j]<=a[1]) {
				t.add(arr[j]);
				j++;
			}
			
			if(j==0) {
				ans[a[2]]=-1;
			}
			else {
				int v=t.getMaxXor(a[0]);
				ans[a[2]]=v;
			}
		}
	
		for(int i:ans) {
			System.out.print(i+" ");
		}
	}

}


