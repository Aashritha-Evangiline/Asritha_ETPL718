package com.evergent.corejava.oops;

public class Calculation {
	
	int x=10, y=20, c;
	
	public void display() {
		c =x+y;
		System.out.println("Addition: " + c);
		System.out.println(" Iam calculation class method");
	}
	

	public static void main(String[] args) {
		Calculation cal = new Calculation();
		cal.display();

	}

}
