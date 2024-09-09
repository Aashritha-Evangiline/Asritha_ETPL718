package com.evergent.corejava.final1;

//Final methods can't override

class MyClass{
	final String u_Name="Aashritha";
	final public void myProducts() {
		System.out.println("All products");
	}
}

public class FinalDemo2 extends MyClass{
	final String c_Name="India";
	
	//FINAL METHOD CAN'T OVERRIDE
/*	public void myProducts() {
	System.out.println("FINAL METHOD CAN'T OVERRIDE");
	} */
	
	public void myData() {
		System.out.println("Name : "+u_Name);
	System.out.println("From : "+c_Name);
	}

	public static void main(String[] args) {
		FinalDemo2 fd = new FinalDemo2();
		fd.myData();
	}
}
