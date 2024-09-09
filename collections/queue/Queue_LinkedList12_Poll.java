package com.evergent.corejava.collections.queue;
import java.util.ArrayDeque;
//index 8
import java.util.Deque;
import java.util.LinkedList;
//index 10 [Day 16]
public class Queue_LinkedList12_Poll {

	public static void main(String[] args) {
		Deque<String> q1 = new LinkedList<>();
		Deque<String> q2 = new LinkedList<>();
		
		q1.add("Banana");
		q1.add("Pineapple");
		q1.add("Watermelon");
		q1.add("Papaya");
		q1.add("Papaya");
		System.out.println(q1);
		System.out.println(q1.containsAll(q2));
		System.out.println(q2.containsAll(q1));
		System.out.println(q1);
		System.out.println(q2);
		System.out.println("Poll value is : "+q1.poll());
		System.out.println("First Poll value is : "+q1.pollFirst());
		System.out.println("Last Poll value is : "+q1.pollLast());

	}

}
