package com.evergent.corejava.collections1;

import java.util.HashSet;
import java.util.Iterator;

public class CF11_HashSet_Generics {

	public static void main(String[] args) {
		HashSet<String> myset = new HashSet<String>();
		// myset.add(100); only string to be inserted
		myset.add("Hello");
		myset.add("Hello");
		myset.add("Hii");
		myset.add("Welcome");
		System.out.println("Printing by object");
		System.out.println(myset);
		System.out.println("____________");
		System.out.println("Printing by Iterator");
		System.out.println("__________");
		Iterator i = myset.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("__________");
		System.out.println("Printing by for each loop using generics");
		System.out.println("__________");
		for(String s:myset) {
			System.out.println(s);
		}
		System.out.println("__________");
		System.out.println("Printing by for each loop using object generics ");
		System.out.println("__________");
		for(Object s:myset) {
			System.out.println(s);
		}
	}
}
