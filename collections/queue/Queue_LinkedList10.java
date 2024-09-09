package com.evergent.corejava.collections.queue;
//index 8
import java.util.Deque;
import java.util.LinkedList;

public class Queue_LinkedList10 {

	public static void main(String[] args) {
		Deque<String> q1 = new LinkedList<>();
		q1.add("Ravi");
		q1.offer("Bhanu");
		q1.add("Shankar");
		q1.add("Shankar");
		q1.add("chandhu");
		
		System.out.println(q1);
		System.out.println(q1.poll());
		System.out.println(q1);

	}

}
