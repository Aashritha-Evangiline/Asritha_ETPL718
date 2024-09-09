package com.evergent.corejava.generalprogramming;


public class LargestOf_5_Numbers {
	
	public static void main(String[] args) {
		int a=10,b=200,c=39,d=400,e=5000;
		if(a>b&&a>c&&a>d&&a>e) {
			System.out.println("A is the largest number "+a);
		}
		
		else if(b>c&&b>d&&b>e) {
			System.out.println("B is the largest number "+b);
		}
		else if(c>d&&c>e) {
			System.out.println("C is the largest number "+c);
		}
		else if(d>e) {
			System.out.println("D is the largest number "+d);
		}
		else {
			System.out.println("E is the largest number "+e);
		}


}
}
