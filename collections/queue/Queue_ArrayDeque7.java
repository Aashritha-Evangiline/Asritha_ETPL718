package com.evergent.corejava.collections.queue;
//index 5
import java.util.ArrayDeque;

public class Queue_ArrayDeque7 {

	public static void main(String[] args) {
		ArrayDeque<String> ad = new ArrayDeque<>();
		ad.add("Banana");
		ad.add("Pineapple");
		ad.add("Watermelon");
		ad.add("Papaya");
		ad.add("Kiwi");
		ad.add("Apple");
		ad.add("Mango");
		System.out.println(ad);
		System.out.println("Size value is : "+ad.size());
		boolean t = ad.isEmpty();
		System.out.println("IS this ArrayDeque empty : "+t);
		ad.clear();
		System.out.println(ad);
	}
}
