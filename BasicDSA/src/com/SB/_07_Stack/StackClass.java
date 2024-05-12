package com.SB._07_Stack;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new Stack();
		
		stack.push(50);
		stack.push(40);
		stack.push(30);
		stack.push(20);
		stack.push(10);
		
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		
		
	}

}
