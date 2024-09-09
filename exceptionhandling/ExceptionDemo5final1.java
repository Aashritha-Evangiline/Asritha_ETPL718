package com.evergent.corejava.exceptionhandling;
/*
13.Finally is block, if exceptions is occurs or not finally block will be executed
 */
public class ExceptionDemo5final1 {
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
			System.err.println("I can handle : "+ae);
		}
		catch(Exception e) {
			System.out.println("I can handle : "+e);
		}
		finally {
		System.out.println("Finally block close connections");
		}
		System.out.println("Aashritha");
		System.out.println("Enddddddddddddddddddd");
	}   
	// Main method
	public static void main(String[] args) {
		ExceptionDemo5final1 ed5 = new ExceptionDemo5final1();
		ed5.myData();
	}
}
