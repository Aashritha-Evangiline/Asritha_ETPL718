package com.evergent.corejava.exceptionhandling;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message){
		//Message the detail message the details msg is saved
		// for later retrieval by the obj.getMessage().
		super(message);
		
		System.out.println();
	}
}
public class UserDefinedExceptionDemo10 {
	//Method that throws the custom checked exceptions
	
	public static void checkAge(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Age must be 18 or older");
		}
		else {
			System.out.println("Access granted-you are old enough");
		}
	}
	public static void main(String[] args)  {
		try {
			checkAge(16); // This will trigger the exception
		}
		catch(InvalidAgeException e) {
			System.out.println("caught the exception : "+e.getMessage());
			System.out.println(e);
		}
		System.out.println("Program continues after handling the exception");
	}
}
