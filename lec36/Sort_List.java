package lec36;

public class Sort_List {
	
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	
//	https://leetcode.com/problems/sort-list/
	public ListNode sortList(ListNode head) {
		if(head==null || head.next==null) {
			return head;
		}
        ListNode mid=middleNode(head);
        ListNode midnext=mid.next;
        mid.next=null;
        ListNode A=sortList(head);
        ListNode B=sortList(midnext);
        return mergeTwoLists(A,B);
        
    }
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr=new ListNode();
        ListNode dummy=curr;
        ListNode head1=list1;
        ListNode head2=list2;
        while(head1!=null && head2!=null) {
        	if(head1.val<head2.val) {
        		curr.next=head1;
        		curr=curr.next;
        		head1=head1.next;
        	}
        	else {
        		curr.next=head2;
        		curr=curr.next;
        		head2=head2.next;
        	}
        }
        if(head1!=null) {
        	curr.next=head1;
        }
        if(head2!=null) {
        	curr.next=head2;
        }
        return dummy.next;
    }
	
	public ListNode middleNode(ListNode head) {
		ListNode slow=head;
		ListNode fast=head;
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
    }

}
