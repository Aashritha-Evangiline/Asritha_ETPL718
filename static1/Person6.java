package com.evergent.corejava.static1;

public class Person6 {
	static String name ="Aash";
	int age=22;
	String address="Hyderabad";
	public void display() {
		name= "Welcome";
		age=21;
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Address: "+address);
	}
	public static void main(String[] args) {
	   Person6 person = new Person6();
	   System.out.println(person.name);
	   System.out.println(person.age);
	   System.out.println("____________");
	   person.display();
	   System.out.println("____________");
	   System.out.println(person.name);
	   System.out.println(person.age);
	}
}
