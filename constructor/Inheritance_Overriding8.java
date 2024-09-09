package com.evergent.corejava.constructor;

class Animal{  // Overriding-> same method name, para, return
	                          // but diff class
	String name;
	 int age;
	 public Animal(String name, int age) {
		 this.name=name;
		 this.age=age;
	 }
	 public void displayInfo() {
		 System.out.println("Name is : "+name);
		 System.out.println("Age is : "+age);
	 }	 
}
class Dog extends Animal{  // Sub class inheritance
	String breed;
	Dog (String name, int age, String breed){
		super(name,age);
		this.breed=breed;
	}
		public void displayInfo() {
		super.displayInfo();
		System.out.println("Breed is : "+breed);
	}
}
public class Inheritance_Overriding8 {
	public static void main(String[] args) {
		Dog dog = new Dog("Buddy",5,"Golden Retriever");
		dog.displayInfo();
	}
}
