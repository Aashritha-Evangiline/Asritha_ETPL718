package com.evergent.corejava.static1;

public class StaticDemo3 {
	//Static methods cannot access non static methods
	static String c_Name="India";
	String u_Name="Aashritha";
	static public void show_Static() {
		System.out.println("Hii iam static method");
	}
	public void show_NonStatic() {
		System.out.println("Hii iam non static");
	}
	public static void main(String[] args) {
		System.out.println(c_Name);  // static var
		//System.out.println(u_Name); // non static var
		System.out.println("__________");
		show_Static();  // static method
		// show_NonStatic();  // non static method
	}
}
