package com.evergent.corejava.collections.stack;
// index 2
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class Stack_Demo6 {

	public static void main(String[] args) {
		Stack<String> mystack = new Stack<String>();
		mystack.push("Red");
		mystack.push("Block");
		mystack.push("White");
		System.out.println(mystack);
		System.out.println("___________________");
		System.out.println("Enumeration Iteration");
		Enumeration e = mystack.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("___________________");
		System.out.println("Iterator");
		Iterator i1 = mystack.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		System.out.println("___________________");
		System.out.println("For each loop");
		
		for(String s: mystack) {
			System.out.println(s);
		}
	}
}
