package com.evergent.corejava.constructor;

public class Employee3 {
	
	int eno;
	String ename;
	double sal;
	
	Employee3(){     // default constructor
		System.out.println("Default Constructor");
	}
	
	Employee3(int eno, String ename, double sal){
		this.eno=eno;
		this.ename=ename;
		sal=sal;
		
	}
	
	public void display() {
		System.out.println("Employee No: "+ eno);
		System.out.println("Employee Name: "+ ename);
		System.out.println("Employee Sal: "+ sal);
	}

	public static void main(String[] args) {
		
		new Employee3();    //object creation
		System.out.println("______");
		Employee3 e = new Employee3(718,"Aashritha",200000);
		 e.display();
	}

}
