package com.evergent.corejava.collections1;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CF6_ListIterator {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Ramu");
		list.add("Ravi");
		list.add("balu");
		list.add("bhanu");
		
		ListIterator li =list.listIterator();
		li.add("Welcome");
		li.add("Hello");
		
		while(li.hasNext()) {
			//Object casting
			String s = (String)li.next();
			System.out.println(s);
			
			if(s.equals("balu")) {
				li.remove();
			}
		}
			System.out.println("___________");
			
		    while(li.hasPrevious()) {
		    	System.out.println(li.previous());
		    }	
	}
}
