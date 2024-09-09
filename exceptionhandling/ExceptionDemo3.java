package com.evergent.corejava.exceptionhandling;
/*
21.There are two exceptions in class, Developer should be handle one after one 
   are occurring in java then remain lines of code is unreachable
 */
public class ExceptionDemo3 {
	String name="null";
	int k=2;
	
	public void myData() {  // method
		try {
			System.out.println("One");
			System.out.println(name.length());
			k=0;
			int t=10/k;  // if k=0 null point exception
			System.out.println(t);
			System.out.println("End");
		}
		catch(NullPointerException ne) {
			System.out.println("I can handle : "+ne);
		}	
		catch(ArithmeticException ae) {
			System.out.println("I can handle : "+ae);
		}
		
		System.out.println("Iam done Iam after catch");
	}   
	// Main method
	public static void main(String[] args) {
		ExceptionDemo3 ed2 = new ExceptionDemo3();
		ed2.myData();
	}
}
