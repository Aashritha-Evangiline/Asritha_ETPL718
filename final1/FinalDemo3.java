package com.evergent.corejava.final1;
// final class can't be inherited

class YourClass {
	// normal class
}

final class MyClass1 extends YourClass{
	//Final class can inherit other classes
}

public class FinalDemo3 // extends MyClass 
                   // can't extend as Myclass1 is final class
{
	public static void main(String[] args) {
		System.out.println("Other classes cannot inherit finla class");
		System.out.println("Final class can inherit other classes");
		System.out.println("Final class also cannot inherit final class");
	}
}
