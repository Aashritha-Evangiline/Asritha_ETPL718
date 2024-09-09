package com.evergent.corejava.exceptionhandling;

class ProductNotFoundException extends Exception{
	ProductNotFoundException(String message){
		super(message);
	//	System.out.println("Hello : "+message);
		
	}
}
public class ProductImpl9 {
	int pNo=105;
	public void myData()throws ProductNotFoundException {
	if(pNo>100) {
		throw new ProductNotFoundException("Product Class not found");
	}
	else {
		System.out.println("Product found");
	}
	
	}
	public static void main(String args []) {
		try {
		ProductImpl9 product1 = new ProductImpl9();
		product1.myData();
		}
		catch(ProductNotFoundException e) {
			System.out.println("1)______START________");
		    System.out.println("e.getMessage() is :  ---- : "+ e.getMessage());
		   
			System.out.println("2)___________________________________________");
			System.out.println("I can handle : (e) : "+ e);
			System.out.println("___________________________");
			
			System.out.println("printStackTrace is :");
			e.printStackTrace();
			e.getMessage();
		}
	}
}
