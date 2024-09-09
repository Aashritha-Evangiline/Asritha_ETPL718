package com.evergent.corejava.exceptionhandling;
/*
 14.throws an exception will be executed methods by method
 */
public class ExceptionDemo7throws {
	String name=null;
	int k=1;
	
	public void myData() throws NullPointerException{
		System.out.println("one");
		System.out.println(name.length());
		System.out.println("end");
	}

	public static void main(String[] args) {
	 try {
	  ExceptionDemo7throws ed = new ExceptionDemo7throws();
			ed.myData();
	 }
	 catch(Exception e) {
	   System.out.println("I can handle: "+e);
	 }
	}
}
