package com.evergent.corejava.collections.stack;
import java.util.Stack;

public class StackDemo5_AllMethods {
	public static void main(String[] args) {
		//Creating stack
		Stack<String> stack = new Stack<>();
		
		//pushing elements into the stack
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");
		stack.push("Date");
		
		//Displaying the stack
		System.out.println("Stack : "+stack);
		
		//peeking at the top Element
		String topElement= stack.peek();
		System.out.println("Top Elements : "+topElement);
		
		//popping an element from the stack
		String removedElements = stack.pop();
		System.out.println("Popped Element : "+removedElements);

		//Displaying the stack after popping
		System.out.println("Stack after pop : "+stack);
		
		//Checking if the stack is empty
		boolean isEmpty = stack.isEmpty();
		System.out.println("Is the stack empty? :"+isEmpty);
		
		//Searching for an element
		int position = stack.search("Banana");
		System.out.println("Position of 'Banana' from top : "+position);
		
		//Clearing the stack
		stack.clear();
		System.out.println("Stack after clearing : "+stack);
	}
}
