package com.evergent.corejava.collections.stack;

import java.util.Stack;

public class Stack_Demo2 {

	public static void main(String[] args) {
		Stack mystack = new Stack();
		mystack.push("Red");
		mystack.push("White");
		mystack.push("Black");
		
		System.out.println(mystack);
		System.out.println(mystack.peek()); //Black
		System.out.println(mystack);
	}
}
