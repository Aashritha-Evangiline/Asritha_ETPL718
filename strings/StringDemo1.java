package com.evergent.corejava.strings;

public class StringDemo1 {

	public static void main(String[] args) {
		// Creating string using String Object 
		String str1 = new String("Hello");
		String str2 = new String ("Hello");
		if(str1==str2) {            // == compares address    false
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		if(str1.equals(str2)) {      //.equals() compares content/data   true
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}
