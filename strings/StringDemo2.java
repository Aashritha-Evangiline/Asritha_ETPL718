package com.evergent.corejava.strings;

public class StringDemo2 {
	public static void main(String[] args) {
		String s1="java";
		String s2 ="java";
		if(s1==s2) {            // == compares address  true
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		if(s1.equals(s2)) {      //.equals() compares content/data   true
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}



 

