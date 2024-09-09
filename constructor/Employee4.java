package com.evergent.corejava.constructor;

public class Employee4 {
	//If we declare as void it will consider as method not a constructor
	//Constructor doesn't have any return type not even void

	
	void Employee4() {
		System.out.println("Default constructor");
	} 
	
	public static void main(String[] args) {

		Employee4 emp4 = new Employee4();
		    emp4.Employee4();
	}

}
