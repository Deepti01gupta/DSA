package lec32;

import java.util.*;

public class Histogram {

//	https://leetcode.com/problems/largest-rectangle-in-histogram/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] heights= {2,1,5,6,2,3};
		System.out.println(largestRectangleArea(heights));
	}
	
	public static int largestRectangleArea(int[] arr) {
		Stack<Integer> st=new Stack<>();
		int area=0;
		for(int i=0;i<arr.length; i++) {
			while(!st.isEmpty() && arr[st.peek()]>arr[i]) {
				int h=arr[st.pop()];
				int r=i;
				if(st.isEmpty()) {
					area=Math.max(area, h*r);
				}
				else {
					int l=st.peek();
					area=Math.max(area, h*(r-l-1));
				}
			}
			st.push(i);
		}
		int r=arr.length;
		while(!st.isEmpty()) {
			int h=arr[st.pop()];
			if(st.isEmpty()) {
				area=Math.max(area, h*r);
			}
			else {
				int l=st.peek();
				area=Math.max(area, h*(r-l-1));
			}
		} 
		return area;
    }
	
}
