package com.evergent.corejava.constructor;

public class Employee2 {
	
	int eno;   // step 8
	String ename;
	double sal;
	
	Employee2(){     // default constructor   // step 3
		System.out.println("Default Constructor");
	}
	
	Employee2(int eno1, String ename1, double sal1){ // step 6
		eno =eno1;  // step 7
		ename=ename1;
		sal=sal1;
		
	}
	
	public void display() {   // step 10
		System.out.println("Employee No: "+ eno);
		System.out.println("Employee Name: "+ ename);
		System.out.println("Employee Sal: "+ sal);
	}

	public static void main(String[] args) {    //step 1
		
		new Employee2();    //object creation   // step 2
		System.out.println("______");  // step 4
		Employee2 e = new Employee2(718,"Aashritha",200000);  // step 5
		 e.display();  // step 9
	
	} // step 11 main method closing

}  // step 12 class closing
