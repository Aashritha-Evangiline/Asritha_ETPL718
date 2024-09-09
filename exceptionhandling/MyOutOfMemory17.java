package com.evergent.corejava.exceptionhandling;

public class MyOutOfMemory17 {

	public static void main(String[] args) throws Exception {
		Integer[] array = new Integer[1000000000*100000000];
		System.out.println(array);
	}
}
