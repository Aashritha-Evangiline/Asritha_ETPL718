package com.evergent.corejava.strings;

public class SplitDemo1 {
	public static void main(String[] args) {
		String str ="Java is a powerful programming language";
		String[] words= str.split(" ");
		
		for(int x=0;x<words.length;x++) {
			System.out.println(words[x]);
		}
	}
}
