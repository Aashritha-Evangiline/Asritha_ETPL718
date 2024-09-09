package com.evergent.corejava.collections1;

import java.util.ArrayList;
import java.util.Iterator;

public class CF10_ArrayList_Generics {

	public static void main(String[] args) {
		//Only Integer values will be inserted
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		mylist.add(100);
		mylist.add(20);
		//mylist.add("Hello"); // only int values
		mylist.add(30);
		mylist.add(70);
		System.out.println(mylist);
		System.out.println("___________");
		Iterator i = mylist.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());	
		}
	}
}
