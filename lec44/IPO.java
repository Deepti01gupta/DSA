package lec44;

import java.util.Arrays;
import java.util.PriorityQueue;

public class IPO {

//	https://leetcode.com/problems/ipo/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=2, w=0;
		int[] profits = {1,2,3};
		int[] capital = {0,1,1};
		int[][] arr=new int[profits.length][2];
		for(int i=0; i<arr.length; i++) {
			arr[i][0]=capital[i];
			arr[i][1]=profits[i];
		}
		System.out.println(findMaximizedCapital(arr,k,w));
	}
	
	public static int findMaximizedCapital(int[][] arr, int k, int w) {
		
		// array ko 0 idx k according sort krenge
		Arrays.sort(arr,(a,b)->a[0]-b[0]);
		
		// pq ko ham 1 idx k according sort krenge
		PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
		
		
		// agar haamra w hamare ith idx k elemet k capital se badha hoga to pq main add kr denge
		// or agar pq empty hue ye k 0 hua to w ko direct return kr denge
		// nahi to ham pq se value nikalke uske profit ko w main add kr denge
		
		for(int i=0; i<arr.length;) {
			while(i<arr.length && w>=arr[i][0]) {
				pq.add(arr[i]);
				i++;
			}
			if(pq.isEmpty() || k==0) {
				return w;
			}
			w+=pq.poll()[1];
			k--;
		}
		while(!pq.isEmpty() && k>0) {
			w+=pq.poll()[1];
			k--;
		}
		return w;
	}

}
