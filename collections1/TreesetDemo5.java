package com.evergent.corejava.collections1;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetDemo5 {

	public static void main(String[] args) {
		TreeSet mySet = new TreeSet(); 
		mySet.add(100);
		mySet.add(20);
		mySet.add(50);
		mySet.add(80);
		System.out.println(mySet);
		Iterator i = mySet.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
