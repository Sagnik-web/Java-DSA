package com.SB._03_Queue;

import java.util.PriorityQueue;

public class QueueClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> queue =  new PriorityQueue<String>();
		
		
		queue.add("Javascrit");
		queue.add("C");
		queue.add("C++");
		queue.add("Python");
		
		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.remove());
		System.out.println(queue.poll());
		
		
		
	}

}
