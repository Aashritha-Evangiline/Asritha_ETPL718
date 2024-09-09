package com.evergent.corejava.exceptionhandling;
/*
17.We should follow exceptions hierarchical
 */
public class ExceptionDemo4 {
	String name="null";
	int k=2;
	
	public void myData() {  // method
		try {
			System.out.println("One");
			System.out.println(name.length());
			//k=0;
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
		catch(Exception e) {
			System.out.println("I can handle : "+e);
		}
		System.out.println("Iam done Iam after catch");
	}   
	// Main method
	public static void main(String[] args) {
		ExceptionDemo4 ed4 = new ExceptionDemo4();
		ed4.myData();
	}
}
