package com.evergent.corejava.exceptionhandling;

public class Exception19_Multi_Catch {
	
	String name ="null";
	int k=0;

	public void myData() {
		try {
		System.out.println("One");
		System.out.println(name.length());
		try {
		int d=10/k;
		}
		catch(ArithmeticException ae) {
			System.out.println("I can handle : "+ae);
			
		}
		System.out.println("End");
		}
	
	catch(NullPointerException e) {
		System.out.println("I can handle : "+e);
	}
	}
	public static void main(String[] args) {
		Exception19_Multi_Catch ed2 = new Exception19_Multi_Catch();
		ed2.myData();
	}
}
