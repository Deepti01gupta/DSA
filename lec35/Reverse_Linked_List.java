package lec35;

public class Reverse_Linked_List {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

//	https://leetcode.com/problems/reverse-linked-list/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null) {
        	ListNode ahead=curr.next;
        	curr.next=prev;
        	prev=curr;
        	curr=ahead;
        }
        return prev;
    }
	
	
	public ListNode reverseList2(ListNode head) {
        return reverse(head,null); 
    }
	
	public ListNode reverse(ListNode curr, ListNode prev) {
		if(curr==null) {
			return prev;
		}
		ListNode ahead=reverse(curr.next,curr);
		curr.next=prev;
		return ahead;
	}

}
