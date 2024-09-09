package com.evergent.corejava.collections1;

import java.util.ArrayList;

public class CF12_ArrayList_forEachOject {

	public static void main(String[] args) {
		ArrayList<Object> mylist = new ArrayList<>();
		mylist.add(100);
		mylist.add("Niash");
		mylist.add("Nizam");
		mylist.add("Aashritha");
		mylist.add(45.5);
		
		for(Object o :mylist) {
			System.out.println(o);
		}	
	}
}
