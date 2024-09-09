package com.evergent.corejava.oops;

public class HAS_A_RelationDemo {
	
	public void show() {
		System.out.println("Show method");
	}

	public static void main(String[] args) {
		HAS_A_RelationDemo has = new HAS_A_RelationDemo();
		
		has.show();
		System.out.println("____________");
		
		Person p = new Person();
		p.display();

	}

}
