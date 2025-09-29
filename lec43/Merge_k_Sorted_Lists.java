package lec43;

import java.util.*;

public class Merge_k_Sorted_Lists {

	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { 
			this.val = val; 
		}
		ListNode(int val, ListNode next) { 
			this.val = val; this.next = next;
		}
	}
	
	
//	https://leetcode.com/problems/merge-k-sorted-lists/
	public ListNode mergeKLists(ListNode[] lists) {
        // PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
        PriorityQueue<ListNode> pq=new PriorityQueue<ListNode>(new Comparator<>(){
            @Override
            public int compare(ListNode o1, ListNode o2){
                return o1.val - o2.val;
            }
        });
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        for(int i=0; i<lists.length; i++){
            if(lists[i]!=null){
                pq.add(lists[i]);
            }
        }

        while(!pq.isEmpty()){
            ListNode r=pq.poll();
            dummy.next=r;
            dummy=dummy.next;
            if(r.next!=null){
                pq.add(r.next);
            }
        }
        return temp.next;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
