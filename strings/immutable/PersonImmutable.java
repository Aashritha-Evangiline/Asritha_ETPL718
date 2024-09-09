package com.evergent.corejava.strings.immutable;

public class PersonImmutable {
	private final String name; // var has to be final as no changes should be done
	                    // private because it should not be accessed further
	private final int age;
	
	//Constructor to Intialize the final variables
	PersonImmutable(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String myName() {   // this has to be public
		                   // as it need to be accessed anywhere
		
		return name;
	}
	
	public int myAge() {
		
		return age;
	}
}
