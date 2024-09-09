package com.evergent.corejava.static1;

public class StaticDemo2 {
	// Calling by direct name with in a class 
	// in other class has to call by class name
	static String  name="Aashritha";
	
	static public void show() {
		System.out.println("Static method calling by name");
	}

	public static void main(String[] args) {
       System.out.println(name);
       show();
	}
}
