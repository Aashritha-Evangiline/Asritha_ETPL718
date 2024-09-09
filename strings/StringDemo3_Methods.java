package com.evergent.corejava.strings;

public class StringDemo3_Methods {

	public static void main(String[] args) {
		String s = new String("   Hello All! How are You?");
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());  // removes spaces at starting
		                              //or ending if any
	}

}
