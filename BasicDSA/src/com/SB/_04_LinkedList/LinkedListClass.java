package com.SB._04_LinkedList;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<>();
		ll.add("Java");
		ll.add("Python");
		ll.add("C");
		ll.add("C++");
		ll.add("Javascrit");
		ll.add("C#");
		
		
		System.out.println(ll);
		System.out.println(ll.get(3));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.element());
		System.out.println(ll.peek());
		System.out.println(ll.remove());
		System.out.println(ll);
		
		
		
	}

}
