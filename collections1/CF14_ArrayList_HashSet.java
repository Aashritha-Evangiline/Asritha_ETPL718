package com.evergent.corejava.collections1;
// index 1
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CF14_ArrayList_HashSet {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Corejava");
		list.add("J2EE");
		list.add("J2SE");
		list.add("My Java");
		//list.add("Corejava");
		System.out.println(list);
		Set<String> s = new HashSet<String>();
		//passing arraylist into hashset
		s.addAll(list);
		System.out.println(s);
		Set<String> s1 = new HashSet<String>();
		s1.add("CoreJava");
		s1.add("J2EE");
		s1.add("J2SE");
		s1.add("My Java");
		//s1.add("CoreJava");
		System.out.println(s1);
		//(.equals) Checks content and order
		if(s.equals(s1)) {
			System.out.println("same");
		}
		else {
			System.out.println("Not same");
		}
	    //In s list is passed and in s1 object values are passed
		System.out.println(s.containsAll(s1));	         
	}
}
