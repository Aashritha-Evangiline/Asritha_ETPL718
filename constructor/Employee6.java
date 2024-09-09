package com.evergent.corejava.constructor;

class MyEmployee{      // super
	int eno;
	public MyEmployee() {
		System.out.println("iam parent default(pd) constructor");
	}
	public MyEmployee(int eno) {
		System.out.println("MyEmployee No (pp) : "+ eno);
	}
}
  public class Employee6 extends MyEmployee{
	String e_name;
	double sal;
	Employee6(){
		System.out.println("Default Constructor");
	}
	Employee6(int eno, String ename, double sal){
		super(eno);
		this.e_name=ename;
		sal = sal;
	}
	public static void main(String[] args) {
		Employee6 emp = new Employee6();
		System.out.println("_________________");
		Employee6 emp6 = new Employee6(123,"Aashritha",2000000);
		System.out.println("Sal is :"+emp6.eno);
	}
}
