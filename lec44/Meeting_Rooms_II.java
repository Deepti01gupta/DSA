package lec44;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Meeting_Rooms_II {

	// on leetcode: meeting room 2
//	https://leetcode.com/problems/meeting-rooms-ii/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] intervals= {{10,30},{5,10},{15,20},{2,6},{12,18},{19,25},{1,5},{3,5}};
		
//		Arrays.sort(intervals,(a,b)->a[0]-b[0]);
//		for(int i=0; i<intervals.length; i++) {
//			System.out.println(intervals[i][0]+" "+intervals[i][1]);
//		}
		System.out.println(Meeting_Rooms(intervals));
		
	}
	
	public static int Meeting_Rooms(int[][] intervals) {
		
		Arrays.sort(intervals,(a,b)->a[0]-b[0]);
		PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)-> a[1]-b[1]);
		pq.add(intervals[0]);
		
		// ham pq main end k according sort krke value rakh rhe h inc order main
		// agar hamara i k start peek k end se badha h to usko bahar kr denge
		
		for(int i=1; i<intervals.length; i++) {
			if(intervals[i][0]>=pq.peek()[1]) {
				pq.poll();
			}			
			pq.add(intervals[i]);
		}
		
		return pq.size();

	}

}
