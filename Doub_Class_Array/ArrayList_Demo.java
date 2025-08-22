package Doub_Class_Array;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println(list);
		
		// ADD
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		
		// ADD AT PROPER INDEX GIVEN : index can range from 0 to list.size()
		list.add(1, -9);
		System.out.println(list);

		// GET
		System.out.println(list.get(3 ));
		
		// REMOVE
		System.out.println(list.remove(2));
		System.out.println(list);
		
		list.add(101);
		list.add(202);
		list.add(303);
		System.out.println(list);
		
		// UPDATE
		list.set(4, -11);
		System.out.println(list);
		
		// SIZE
		System.out.println(list.size());
		
		// SORT
		Collections.sort(list);
		System.out.println(list);
		
		ArrayList<String> ll = new ArrayList<>();
		ll.add("Ankit");
		ll.add("Raj");
		ll.add("Pooja");
		ll.add("Puneet");
		ll.add("Ankita");
		ll.add("Nora");
		ll.add("Krishana");
		System.out.println(ll);
		
		for(int i=0; i<ll.size(); i++) {
			System.out.print(ll.get(i)+" ");
		}
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		for(int i:list) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
	}

}

