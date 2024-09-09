package com.evergent.corejava.strings;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hii");
		StringBuilder sb1 = new StringBuilder("Hello");
		
// We can add in sbuilder by append method only no direct assigning.
		//APPEND
		sb=sb.append(" Aashritha");
		System.out.println("After append : "+sb);

		//Insert
		sb.insert(sb.length()-1, " Evan");
		System.out.println("After inserting : "+sb);
		
		//delete
		sb.delete(0, 5);
		System.out.println("After deletion : "+sb);
		
		//replace
		sb.replace(0, 2,"Replace");
		System.out.println(sb);
		
		//reverse
		sb.reverse();
		System.out.println("After reverse :" +sb);
		
		System.out.println(sb1.capacity()+" capacity is (16+ length) ["+ sb1+"]");
		System.out.println(sb1.length());
	}
}
