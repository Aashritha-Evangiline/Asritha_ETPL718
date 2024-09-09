package com.evergent.corejava.collections.stack;

import java.util.Stack;

public class StackSearch_Demo3 {
	public static void main(String[] args) {
		Stack mystack = new Stack();
		mystack.push("Red");  // search -3
		mystack.push("White");// search -2
		mystack.push("Black"); // search -1
		
		System.out.println("White search val : "+mystack.search("White"));
		System.out.println(mystack);
	}
}
