package com.evergent.corejava.generalprogramming;

public class SwappingOfTwoNumbersWithoutThirdVar {
	public static void main(String[] args) {
		int a=20, b=50;
		
		a=b+a;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);

}
}
