package com.evergent.corejava.strings;

public class StringPerformance3 {

	public static void main(String[] args) {
		String series="";
		for(int x=0;x<26;x++) {
			char ch =(char)('a'+x);
			series=series+ch;
		}
		System.out.println(series);
	}
}
