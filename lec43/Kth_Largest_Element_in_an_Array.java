package lec43;

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {

//	https://leetcode.com/problems/kth-largest-element-in-an-array/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,2,3,1,2,4,5,5,6};
		int k=4;
		System.out.println(kth_largest(arr,k));
	}
	
	public static int kth_largest(int[] arr, int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0; i<k; i++) {
			pq.add(arr[i]);
		}
		for(int i=k; i<arr.length; i++) {
			if(arr[i]>pq.peek()) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		return pq.peek();
	}

}
