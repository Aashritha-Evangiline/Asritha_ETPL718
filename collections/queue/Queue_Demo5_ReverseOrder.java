package com.evergent.corejava.collections.queue;
//index 3
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Demo5_ReverseOrder {

	public static void main(String[] args) {
//	Usually priority queue gives most priority to lowest value
// but by using Comparator.reverseOrder() 
//This will give high priority to highest value
		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.add(8);
		pq.add(2);
		pq.add(5);
		pq.add(9);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
	

}
