package lec35;


public class Linked_List_Cycle {
	
	class ListNode {
		int val;
		ListNode next;
        ListNode(int x) {
        	val = x;
	        next = null;
	    }
	}

//	https://leetcode.com/problems/linked-list-cycle/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean hasCycle(ListNode head) {
		ListNode slow=head;
		ListNode fast=head;
		while(fast!=null && fast.next!=null) {
			if(slow==fast) {
				return true;
			}
			slow=slow.next;
			fast=fast.next.next;
		}
		return false;
    }

}
