package com.evergent.corejava.wrapperclasses;

import java.util.ArrayList;

//Inserting values into ArrayList using wrapper classes
public class ArrayList_WrapperClasses4 {

	public static void main(String[] args) {
		ArrayList myList = new ArrayList<>();
		
		// Way 1
		int a=10;
		Integer i1 = new Integer(a);
		myList.add(i1);
		
		//Way2
		Integer i2 = new Integer(100);
		myList.add(i2);
		
		//Way3
		myList.add(new Integer(200));
		
		System.out.println(myList);
		
		ArrayList myList1 = new ArrayList();
		myList1.add(120);
		
		System.out.println(myList1.get(0));
	}
}
