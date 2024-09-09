package com.evergent.corejava.collections.queue;
//index 7
import java.util.ArrayDeque;

public class Queue_ArrayDeque9_Poll {

	public static void main(String[] args) {
		ArrayDeque<String> ad = new ArrayDeque<>();
		ad.add("Banana");
		ad.add("Pineapple");
		ad.add("Watermelon");
		ad.add("Papaya");
		System.out.println(ad);
		System.out.println("Poll value is : "+ad.poll());
		System.out.println("First Poll value is : "+ad.pollFirst());
		System.out.println("Last Poll value is : "+ad.pollLast());
		System.out.println(ad);
		
	}
}
