package com.evergent.corejava.oops;

public class Person {
	
	String pName ="Aashritha";
	int pAge = 22;
	String pAddress ="Hyderabad";
	
	public void display() {
		System.out.println("Name is : " + pName);
		System.out.println("Age is : "+pAge);
		System.out.println("Address is : "+ pAddress);
	}

	public static void main(String[] args) {
		Person person = new Person();
		person.display();
		
	}

}
