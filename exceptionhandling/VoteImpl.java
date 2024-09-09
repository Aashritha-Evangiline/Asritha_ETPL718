package com.evergent.corejava.exceptionhandling;

class AgeNotSupportException extends Exception{
	AgeNotSupportException(String msg){
		System.out.println("Hello : "+ msg);
	}
}

public class VoteImpl {
	
	public void myData() throws AgeNotSupportException {
		int age= 12;
		if(age<18) {
		throw new AgeNotSupportException("Your age is not valid to vote");
		}
		else {
			System.out.println("Your eligible to vote");
		}
	}

	public static void main(String[] args) {
		VoteImpl vote = new VoteImpl();
		try {
		   vote.myData();
		}
		catch(AgeNotSupportException a) {
			System.out.println(a.getMessage());
			System.out.println(a);
			a.printStackTrace();
		}
	}
}
