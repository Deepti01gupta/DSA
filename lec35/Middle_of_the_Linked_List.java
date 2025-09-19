package lec35;


public class Middle_of_the_Linked_List {
	public class ListNode {
		int val;
		ListNode next;
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	//https://leetcode.com/problems/middle-of-the-linked-list/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public ListNode middleNode(ListNode head) {
		ListNode slow=head;
		ListNode fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
    }

}
