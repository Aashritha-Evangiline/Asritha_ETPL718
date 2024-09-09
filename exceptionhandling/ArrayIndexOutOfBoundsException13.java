package com.evergent.corejava.exceptionhandling;

public class ArrayIndexOutOfBoundsException13 {

	public static void main(String[] args) {
		int numbers[] = {1,2,3,4,5};
		try {
			System.out.println("Accessing element at index 10 : "+numbers[10]);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);	
		}
		System.out.println("Program Continues");
	}
}
