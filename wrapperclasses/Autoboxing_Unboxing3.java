package com.evergent.corejava.wrapperclasses;

public class Autoboxing_Unboxing3 {

	public static void main(String[] args) {
		//AutoBoxing of character
		char ch='A';
		Character myc = new Character(ch);
		
		//Auto UnBoxing
		char ch1 = myc.charValue();
		
		//Print Statements
		System.out.println("Value of ch : "+ ch);
		System.out.println("Value of ch1 : "+ch1);
	}
}
