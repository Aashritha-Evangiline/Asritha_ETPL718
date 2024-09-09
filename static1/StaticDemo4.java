package com.evergent.corejava.static1;

//Non Static method can access static methods and static variables
public class StaticDemo4 {
	static String c_Name="India";
	String u_Name="Aashritha";
	static public void show_Static() {
		System.out.println("Hi iam static method");
	}
	public void show_NonStatic() {
		System.out.println("static var but called in non static method : "+c_Name);
		show_Static();
		System.out.println("Hi iam non static methods");
	}
	public static void main(String[] args) {
		StaticDemo4 sd = new StaticDemo4();
		System.out.println(sd.u_Name);
		System.out.println("_______________");
		sd.show_NonStatic();
		System.out.println("________Calling ststic by obj__________");
		sd.show_Static();
	}
}
