package com.evergent.corejava.wrapperclasses;

public class WrapperClassDemo1 {

	public static void main(String[] args) {
		//Auto datatypes to objects  // AutoBoxing
		int a=10;
		Integer i1 = new Integer(10);
		
		//Object data converts to datatypes // Auto Unboxing
		int a1 = i1.intValue();
		System.out.println(a1);
	}
}
