package com.evergent.corejava.strings;

public class RemoveSpaces {

	public static void main(String[] args) {
		String str= "Hello World, this is a test";
		System.out.println(str);
		String noSpaces=str.replace(" ", "");
		System.out.println(noSpaces);

	}

}
