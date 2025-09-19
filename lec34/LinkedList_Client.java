package lec34;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.AddFirst(10);
		ll.AddFirst(20);
		ll.AddFirst(30);
		ll.Display();
		ll.AddLast(40);
		ll.AddLast(50);
		ll.Display();
		ll.AddAtIndex(70, 3);
		ll.Display();
		System.out.println(ll.GetFirst());
		System.out.println(ll.RemoveFirst());
		ll.Display();
		System.out.println(ll.RemoveLast());
		ll.Display();
		System.out.println(ll.RemoveAtIndex(2));
		ll.Display();
	}

}
