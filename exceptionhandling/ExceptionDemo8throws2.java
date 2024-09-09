package com.evergent.corejava.exceptionhandling;
/*
 14.throws an exception will be executed methods by method
 */
public class ExceptionDemo8throws2 {
	String name=null;
	int k=0;
	
	public void myData() throws NullPointerException{
		System.out.println("one");
		System.out.println(name.length());
		System.out.println("end");
	}

	public void myChange() throws NullPointerException{
		myData();
		System.out.println("My change method");
	}
	
	public static void main(String[] args) {
	 try {
	  ExceptionDemo8throws2 ed = new ExceptionDemo8throws2();
			ed.myChange();
	 }
	 catch(Exception e) {
	   System.out.println("I can handle: "+e);
	 }
	}
}
