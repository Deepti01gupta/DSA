package lec34;

public class LinkedList {
	class Node{
		int data;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	// O(1)
	public void AddFirst(int item) {
		Node nn=new Node();
		nn.data=item;
		if(size==0) {
			head=nn;
			tail=nn;
			size++;
		}
		else {
			nn.next=head;
			head=nn;
			size++;
		}
	}
	
	//O(1)
	public void AddLast(int item) {
		if(size==0) {
			AddFirst(item);
		}
		else {
			Node nn=new Node();
			nn.data=item;
			tail.next=nn;
			tail=tail.next;
			size++;
		}
	}
	
	// O(N)
	public void AddAtIndex(int item, int k) throws Exception{
		if(k==0) {
			AddFirst(item);
		}
		else if(k==size) {
			AddLast(item);
		}
		else {
			Node nn=new Node();
			nn.data=item;
			
			Node curr=GetNode(k-1);
			Node temp=curr.next;
			curr.next=nn;
			nn.next=temp;
			size++;
		}
	}
	
	// O(1)
	public int GetFirst() {
		if(size==0) {
			return -1;
		}
		return head.data;
	}
	
	// O(1)
	public int GetLast() {
		if(size==0) {
			return -1;
		}
		return tail.data;
	}
	
	// O(N)
	public int GetIndex(int k) throws Exception{
		return GetNode(k).data;
	}
	
	// O(1)
	public int RemoveFirst() {
		int rv=head.data;
		if(size==1) {
			head=null;
			tail=null;
			size--;
		}
		else {
			head=head.next;
			size--;
		}
		return rv;
	}
	
	// O(1)
	public int RemoveLast() throws Exception{
		if(size==1) {
			return RemoveFirst();
		}
		else {
			int rv=tail.data;
			Node last_second_node=GetNode(size-2);
			last_second_node.next=null;
			tail=last_second_node;
			size--;
			return rv;
		}
	}
	
	// O(N)
	public int RemoveAtIndex(int k) throws Exception{
		if(k==0) {
			return RemoveFirst();
		} 
		else if(k==size-1) {
			return RemoveLast();
		}
		else {
			Node node=GetNode(k-1);
			Node temp=node.next;
			node.next=temp.next;
			temp.next=null;
			size--;
			return temp.data;
		}
		
	}
	
	
	
	// O(K)
	private Node GetNode(int k) throws Exception{
		if(k<0 || k>=size) {
			throw new Exception("bklol index theek se de do");
		}
		Node curr=head;
		for(int i=0; i<k; i++) {
			curr=curr.next;
		}
		return curr;
	}
	
	// O(1)
	public int size() {
		return size;
	}
	
	//O(N)
	public void Display() {
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" --> ");
			curr=curr.next;
		}
		System.out.println(".");
	}
}
