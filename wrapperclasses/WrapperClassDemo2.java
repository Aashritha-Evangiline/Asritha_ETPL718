package com.evergent.corejava.wrapperclasses;

public class WrapperClassDemo2 {

	public static void main(String[] args) {
		float f= 4.5f;
		Float f1 = new Float(f); //Auto Boxing
		float f2 = f1.floatValue(); // Auto unboxing
		//System.out.println(f2);
		
		double d =2.3333;
		Double d1= new Double(d); //Auto Boxing
		double d2 = d1.doubleValue();
		//System.out.println(d2);
		
		byte b= 10;
		Byte b1 = new Byte(b); //Auto Boxing
		byte b2 = f1.byteValue(); // Auto unboxing
		//System.out.println(b2);
		
		//float
		System.out.println("Float value is : "+f);
		System.out.println("Float object value is : "+f1);
		System.out.println("Convert Float object value to primitive : "+f2);
		System.out.println("_________________________________________________");
		//Double
		System.out.println("double value is : "+d);
		System.out.println("Float object value is : "+d1);
		System.out.println("Convert Float object value to primitive : "+d2);
		System.out.println("______________________________________________________");
		//Byte
				System.out.println("Byte value is : "+b);
				System.out.println("Byte object value is : "+b1);
				System.out.println("Convert Byte object value to primitive : "+b2);			
	}
}
