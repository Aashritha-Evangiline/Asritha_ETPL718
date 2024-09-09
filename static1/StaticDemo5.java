package com.evergent.corejava.static1;

public class StaticDemo5 {
	static {
		System.out.println("static block:open db/ network Connections");
	}
	static String c_Name="India";
	static public void myData() {
		System.out.println("Static block");
	}
	public static void main(String[] args) {
		System.out.println(c_Name);
		myData();
	}
}
