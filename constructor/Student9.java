package com.evergent.corejava.constructor;

public class Student9 {
	String name;
	int age;
	
	Student9(String name, int age){
		this.name=name;
		this.age=age;
	}
	Student9(Student9 s){
		this.name=s.name;
		this.age= s.age;
	}
	public void display() {
		System.out.println("Name is : "+ name);
		System.out.println("Age is : "+ age);
	}
	
	public static void main(String[] args) {
		Student9 stud = new Student9("Aashritha",22);
		stud.display();
		System.out.println("_________");
		Student9 stu = new Student9(stud);
		stu.display();
	}
}
