package com.evergent.corejava.strings;

public class StringPerformance5 {

	public static void main(String[] args) {
		String name = " Java Technologies ";
		System.out.println(name);
		System.out.println(name.indexOf('T')); //5
		System.out.println(name.indexOf('x')); // -1 not found
		name =name.strip();
		System.out.println(name+".");
		
		System.out.println(name.hashCode());
		System.out.println(name.hashCode());
		name=name.concat("hii");
		System.out.println(name.hashCode());
		String obj = new String("Shivani");
		System.out.println("________");
		System.out.println(obj.hashCode());
		obj= obj.concat("hii");
		System.out.println(obj.hashCode());
		
		System.out.println("_________________");
		StringBuffer obj1 = new StringBuffer("Shivani");
		System.out.println("________");
		System.out.println(obj1.hashCode());
		obj= obj.concat("hii");
		System.out.println(obj1.hashCode());
		
		System.out.println("_________________");
		StringBuilder obj2 = new StringBuilder("Shivani");
		System.out.println("________");
		System.out.println(obj2.hashCode());
		obj= obj.concat("hii");
		System.out.println(obj2.hashCode());
		
	
	}
}
