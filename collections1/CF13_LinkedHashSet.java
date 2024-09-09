package com.evergent.corejava.collections1;
import java.util.LinkedHashSet;

public class CF13_LinkedHashSet {
	public static void main(String[] args) {
		// creating a LinkedHashset
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		//Inserting into linkedHashSet
		linkedHashSet.add("Apple");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Orange");
		linkedHashSet.add("Mango");
		linkedHashSet.add("Grapes");
		//Displaying the LinkedHashSet
		System.out.println("LinkedHashSet : "+linkedHashSet);
		System.out.println("___________________");
		//Iterating through the forEach advance loop
		System.out.println("Iterating over LinkedHashSet : ");
		for(String s:linkedHashSet) {
			System.out.println(s);
		}
		System.out.println("___________________");
		//Checking if the set contains an element returns true if the
		// set contains the specified element else false
		System.out.println("Contains 'Mango' : "+linkedHashSet.contains("Mango"));
		System.out.println("Contains 'nango' : "+linkedHashSet.contains("nango"));
		System.out.println("___________________");
		//Remove an element
		System.out.println("removing 'nango' : " + linkedHashSet.remove("nango"));
		linkedHashSet.remove("Mango");
		System.out.println("removing 'Banana' : "+linkedHashSet.remove("Banana"));
		System.out.println("___________________");
		System.out.println("After removing 'Banana' : "+linkedHashSet);
		System.out.println("___________________");
		//Checking the size of the LinkedHashSet
		System.out.println("Size of LinkedHashSet : " +linkedHashSet.size());
		//Clear the LinkedHashSet
		linkedHashSet.clear();
		System.out.println("After clearing : "+linkedHashSet);
	}
}
