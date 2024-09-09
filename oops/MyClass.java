package com.evergent.corejava.oops;

public class MyClass extends Calculation {
	
	public void display() {
		System.out.println(" Iam local class method");
	}

	public static void main(String[] args) {
		MyClass  mc = new MyClass();
		mc.display();

	}

}
