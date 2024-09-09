package com.evergent.corejava.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;
// Doesn't accept diff datatypes
//Most priority is given to the least value
//Least value will be in te peek
//Least value will be removed first
//When empty when we use pop()--->null will come
// if remove()--->Exception will come
public class Queue_Demo3 {
	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();
		pq.add(8);
	//	pq.add("Aashritha");
		pq.offer(5);
		pq.add(2);
		pq.add(9);
		pq.add(9);
		
		System.out.println(pq);
		System.out.println(pq.poll());//priority to least val //2
		System.out.println(pq.remove());//5
		System.out.println(pq);//8 9
		
		pq.clear();
		System.out.println(pq.poll());
		System.out.println(pq.remove());
	}
}
