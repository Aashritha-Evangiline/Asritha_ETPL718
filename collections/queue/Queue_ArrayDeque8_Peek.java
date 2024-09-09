package com.evergent.corejava.collections.queue;
//index 6
import java.util.ArrayDeque;

public class Queue_ArrayDeque8_Peek {

	public static void main(String[] args) {
		ArrayDeque<String> ad = new ArrayDeque<>();
		ad.add("Banana");
		ad.add("Pineapple");
		ad.add("Watermelon");
		ad.add("Papaya");
		System.out.println(ad);
		System.out.println("Peek value is : "+ad.peek());
		System.out.println("First Peek value is : "+ad.peekFirst());
		System.out.println("Last Peek value is : "+ad.peekLast());
		
	}
}
