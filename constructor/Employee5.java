package com.evergent.corejava.constructor;

public class Employee5 {
	//We can call one constructor in another constructor using this keyword
	//                                                with in the class
	int eno;
	String ename;
	double sal;
	
	Employee5(){     // default constructor
		System.out.println("Default Constructor");
	}
	Employee5(int eno){
		this.eno=eno;
	}
	Employee5(int eno, String ename, double sal){
		this(eno);        // calling one constructor in another
		this.ename=ename;
		sal=sal;
		
	}
	
	public void display() {
		System.out.println("Employee No: "+ eno);
		System.out.println("Employee Name: "+ ename);
		System.out.println("Employee Sal: "+ sal);
	}

	public static void main(String[] args) {
		
		new Employee5();    //object creation
		System.out.println("______");
		Employee5 e = new Employee5(718,"Aashritha",200000);
		 e.display();
	}

}
