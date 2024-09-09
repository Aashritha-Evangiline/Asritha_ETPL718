package com.evergent.corejava.final1;

//final var
public class FinalDemo1 {
	
	final String u_Name="Aashritha";
	public void display() {
		// u_name="yadidya"; // final var can't br modified
		final int age=22;
		//age=21;    // final var can't br modified
		System.out.println(u_Name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		FinalDemo1 fd = new FinalDemo1();
		fd.display();
	}
}
