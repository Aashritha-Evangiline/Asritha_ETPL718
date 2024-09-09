package com.evergent.corejava.collections1;
import java.util.*;

public class HashSetDemo4 {

	public static void main(String[] args) {
		//HashSet cannot be resolved to a type
		HashSet<Object> myset = new HashSet<>();
		myset.add(100);
		myset.add("Hello");
		myset.add(45.5);
		myset.add("hii");
		myset.add(40);
		myset.add(100);
		System.out.println(myset);
		
		Iterator i = myset.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
