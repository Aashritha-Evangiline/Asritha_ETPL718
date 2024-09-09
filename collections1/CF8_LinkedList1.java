package com.evergent.corejava.collections1;

import java.util.LinkedList;

public class CF8_LinkedList1 {

	public static void main(String[] args) {
		LinkedList mylist = new LinkedList();
		mylist.add("TATA");
		mylist.add("BMW");
		mylist.add("Volvo");
		mylist.add("Maruthi");
		mylist.add("Safari");
		System.out.println(mylist);
		mylist.remove(4);
		System.out.println(mylist);
		mylist.clear();
		System.out.println(mylist);	
	}
}
