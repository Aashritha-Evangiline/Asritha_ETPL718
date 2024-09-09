package com.evergent.corejava.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;
// Doesn't accept diff datatypes
//Most priority is given to the least value
public class Queue_Demo1 {
	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();
		pq.add(100);
	//	pq.add("Aashritha");
		pq.offer(200);
		pq.add(50);
		System.out.println(pq);
	}
}
