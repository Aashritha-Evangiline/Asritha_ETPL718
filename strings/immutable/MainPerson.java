package com.evergent.corejava.strings.immutable;

public class MainPerson {

	public static void main(String[] args) {

		PersonImmutable PI = new PersonImmutable("Raju",30);
		System.out.println("Name : "+ PI.myName());
		System.out.println("Age : "+PI.myAge());	
	}
}
