package lec32;

import java.util.*;

public class Next_Greater_Element {

//	https://codeskiller.codingblocks.com/problems/1053
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int[] arr= new int[n];
			for(int i=0; i<n; i++) {
				arr[i]=sc.nextInt();
			}
			int[] ans=greater1(arr);
			for(int i=0; i<ans.length; i++) {
				System.out.print(ans[i]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
	
	// O(2*N)
	public static int[] greater1(int[] arr) {
		Stack<Integer> st=new Stack<>();
		int[] ans=new int[arr.length];
		Arrays.fill(ans, -1);
		for(int i=0;i<arr.length; i++) {
			while(!st.isEmpty() && arr[st.peek()]<arr[i]) {
				ans[st.pop()]=arr[i];
			}
			st.push(i);
		}
		return ans;
	}
	
	
	public static int[] greater(int[] arr) {
		int[] ans=new int[arr.length];
		Arrays.fill(ans, -1);
		for(int i=0; i<arr.length; i++) {
			int j=i+1;			
			while(j<arr.length) {
				if(arr[j]>arr[i]) {
					ans[i]=arr[j];
					break;
				}
				j++;
			}
		}
		return ans;
	}

}
