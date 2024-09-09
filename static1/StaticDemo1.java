package com.evergent.corejava.static1;

public class StaticDemo1 {
	//Calling by className
	static String name="Aashritha";
	
	static public void myData() {
		System.out.println("Static method");
	}
	public static void main(String[] args) {
		System.out.println(StaticDemo1.name);
		StaticDemo1.myData();
	}
}
