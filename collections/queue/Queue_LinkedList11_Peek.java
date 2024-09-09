package com.evergent.corejava.collections.queue;
import java.util.ArrayDeque;
//index 8
import java.util.Deque;
import java.util.LinkedList;
//index 9
public class Queue_LinkedList11_Peek {

	public static void main(String[] args) {
		Deque<String> q1 = new LinkedList<>();
		
		q1.add("Banana");
		q1.add("Pineapple");
		q1.add("Watermelon");
		q1.add("Papaya");
		q1.add("Papaya");
		System.out.println(q1);
		System.out.println("Peek value is : "+q1.peek());
		System.out.println("First Peek value is : "+q1.peekFirst());
		System.out.println("Last Peek value is : "+q1.peekLast());
		

	}

}
