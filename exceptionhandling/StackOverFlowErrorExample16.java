package com.evergent.corejava.exceptionhandling;

public class StackOverFlowErrorExample16 {

	public static void main(String[] args) {
		try {
			recursiveMethod();
		}
		catch(StackOverflowError e) {
		  System.out.println("StackOverFlowError Caught : "+ e);
		   // e.printStackTrace();
		}
	}
	
	//Recursive method with no base code
	public static void recursiveMethod() {
		recursiveMethod();  // The method keeps calling itself
	}
}
