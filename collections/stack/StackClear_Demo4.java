package com.evergent.corejava.collections.stack;

import java.util.Stack;

public class StackClear_Demo4 {
	public static void main(String[] args) {
		Stack mystack = new Stack();
		mystack.push("Red");  // search -3
		mystack.push("White");// search -2
		mystack.push("Black"); // search -1
		
		System.out.println(mystack);
		mystack.clear();
		
		boolean b = mystack.isEmpty();
		System.out.println(b);
		System.out.println(mystack);
	}
}
