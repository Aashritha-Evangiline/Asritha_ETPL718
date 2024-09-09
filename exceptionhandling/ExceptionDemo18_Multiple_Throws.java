package com.evergent.corejava.exceptionhandling;

public class ExceptionDemo18_Multiple_Throws {
	
	String name ="null";
	int k=0;

	public void myData() throws NullPointerException,ArithmeticException{
		System.out.println("One");
		System.out.println(name.length());
		int d=10/k;
		System.out.println(d);
		System.out.println("End");
	}

	public static void main(String[] args) {
		
		try {
			ExceptionDemo18_Multiple_Throws ed2 = new ExceptionDemo18_Multiple_Throws();	
			ed2.myData();
		}
		catch(Exception e) {
			System.out.println("I can handle : "+ e);
		}
	}
}
