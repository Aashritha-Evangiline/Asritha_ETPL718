package com.evergent.corejava.strings;

public class ContainsSubString {

	public static void main(String[] args) {
		
		String str=" The quick brown ooofox jumps over the lazy dog";
		String substr="fox";
		boolean contains = str.contains(substr);
		System.out.println("Contains '"+ substr + "': "+ contains);

	}

}
