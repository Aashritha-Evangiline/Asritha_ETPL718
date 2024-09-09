package com.evergent.corejava.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;
// Doesn't accept diff datatypes
//Most priority is given to the least value
//Least value will be in the peek
//Least value will be removed first
public class Queue_Demo2 {
	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();
		pq.add(8);
	//	pq.add("Aashritha"); // cant add diff datatype
		pq.offer(5);
		pq.add(2);
		pq.add(9);
		
	//	System.out.println(pq.poll()); // used to delete // 2
	//	System.out.println(pq.remove());// used to delete // 9
		System.out.println(pq);
		
	
	}
}
