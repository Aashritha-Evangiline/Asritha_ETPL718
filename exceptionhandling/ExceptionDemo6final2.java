package com.evergent.corejava.exceptionhandling;
/*
 16.try followed by either catch block or finally block
 */
public class ExceptionDemo6final2 {
	String name="null";
	int k=2;
	public void myData() {
		try {
			System.out.println("One");
			System.out.println(name.length());
			
			int t=10/k;
			System.out.println(t);
			System.out.println("End");
		}
		finally {
			System.out.println("Finally block close connections");
		}
	}

	public static void main(String[] args) {
		ExceptionDemo6final2 ed2 = new ExceptionDemo6final2();
		ed2.myData();
	}
}
