package com.evergent.corejava.exceptionhandling;

class InvalidScoreException extends Exception{
	InvalidScoreException(String message){
		super(message);
	}
}
public class UserDefinedUncheckedExceptionDemo12 {
	
	public static void validateScore(int score)throws InvalidScoreException  {
		if(score<0|| score>100 ) {
			throw new InvalidScoreException("Score must be between o and 100");	
		}
		else {
			System.out.println("Score is valid and your score is : "+score);
		}
	}

	public static void main(String[] args) {
		try {
			validateScore(101);
		}
		catch( InvalidScoreException e) {
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
