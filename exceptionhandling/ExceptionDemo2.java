package com.evergent.corejava.exceptionhandling;
/*
 3.All exceptions are executed while abnormal conditions only
4.Normal flow it won’t execute any exceptions
5.Once any exceptions are occurring in java then remain lines of code is unreachable
 */
public class ExceptionDemo2 {
	String name="null";
	public void myData() {  // method
		try {
			System.out.println("One");
			System.out.println(name.length());
			System.out.println("End");
		}
		catch(NullPointerException e) {
			System.out.println("I can handle : "+e);
		}	
	}   
	// Main method
	public static void main(String[] args) {
		ExceptionDemo2 ed2 = new ExceptionDemo2();
		ed2.myData();
	}
}
