package lec32;

import java.util.*;

public class Stock_Span {

//	https://codeskiller.codingblocks.com/problems/502
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int[] ans=stock(arr);
		for(int i=0;i<n; i++) {
			System.out.print(ans[i]+" ");
		}
		sc.close();
	}
	
	public static int[] stock(int[] arr) {
		int[] ans=new int[arr.length];
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<arr.length; i++) {
			while(!st.isEmpty() && arr[i]>=arr[st.peek()]) {
				st.pop();
			}
			if(st.isEmpty()) {
				ans[i]=i+1;
			}
			else {
				ans[i]=i-st.peek();
			}
			st.push(i);
		}
		return ans;
	}

}