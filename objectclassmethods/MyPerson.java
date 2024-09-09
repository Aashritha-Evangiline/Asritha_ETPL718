package com.evergent.corejava.objectclassmethods;

class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;	
	}
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
	public String toString() {
	
		return "Name : "+ name +" "+"Age : "+age;
	}
}

public class MyPerson {
	public static void main(String[] args) {
		Person p = new Person("Aashritha", 22);
           System.out.println(p);		
           System.out.println(p.hashCode());
	}
}
