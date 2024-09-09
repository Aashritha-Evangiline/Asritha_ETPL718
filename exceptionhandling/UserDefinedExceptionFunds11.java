package com.evergent.corejava.exceptionhandling;

class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String message) {
		super(message);
	}
}

public class UserDefinedExceptionFunds11 {
	//Method that throws the custom checked exceptions
	
		public static void withdraw(double amount) throws InsufficientFundsException  {
			double balance = 500.00;
			if(amount>balance) {
				throw  new InsufficientFundsException("Insufficient funds for withdrawal");
			}
			else {
				System.out.println("Withdrawal Successful");
			}
		}

	public static void main(String[] args) {
		try {
			withdraw(600);
		}
		catch(InsufficientFundsException e) {
			System.out.println("I can handle : "+e);
			System.out.println("____________________________________________________________________________________________\n");
			
			System.out.println(e.getMessage());
			System.out.println("____________________________________________________________________________________________\n");
			e.printStackTrace();
		}	
	}
}
