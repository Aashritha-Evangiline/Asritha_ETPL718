package com.evergent.corejava.logicalprogramming1;

public class FactorialNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5; int fact=1;
		for(int x=5;x>=1;x--) {
			fact = fact*x;
		}
		
		System.out.println(fact);

	}

}
