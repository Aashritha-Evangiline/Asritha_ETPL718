package com.evergent.corejava.strings;

public class SplitDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str= "Java is a powerful programming language";
       String words[]=str.split(" ");
       
       // printing using for each loop
       
       for(String s: words) {
    	   System.out.println(s);
       }
	}

}
