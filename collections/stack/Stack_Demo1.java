package com.evergent.corejava.collections.stack;

import java.util.Stack;
//LIFO
//push(), pop(), peek()
public class Stack_Demo1 {
	public static void main(String args[]) {
	Stack mystack = new Stack();
	
	mystack.push("Red");
	mystack.push("White");
	mystack.push("Red");
	mystack.push("Yellow");
	mystack.push("Pink");  // last in so peek
	System.out.println(mystack);
	System.out.println(mystack.pop());
	System.out.println(mystack);
	System.out.println(mystack.pop());
	System.out.println(mystack);
	System.out.println(mystack.pop());
	System.out.println(mystack);
}
}
