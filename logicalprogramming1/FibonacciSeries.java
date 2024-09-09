package com.evergent.corejava.logicalprogramming1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1=0,num2=1;
		for(int x=1;x<=5;x++) {
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(num3);
		}
	}

}
