package com.evergent.corejava.strings;

public class StringBufferExamples {
	//append,insert,delete,replace,reverse,capacity,length
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("Intail string : "+ sb);
		// Append a string
		sb.append(" world!");
		System.out.println("After append :"+sb);
		System.out.println("________________________________________");
		//Insert a string at a specific position
		sb.insert(5, "Aashritha");
		       //  index
		System.out.println("After inserting at 5th index : "+ sb);
		System.out.println("________________________________________");
		//Replace a substring
		sb.replace(0, 3, "language");
		      // from to  how many letters to replace
		System.out.println("After replace : "+sb);
		System.out.println("________________________________________");
		// Delete a substring
		sb.delete(0, 5);
		     // deletes between 2 and 7
		System.out.println("After delete : "+ sb);
		System.out.println("________________________________________");
		// replace the string
		sb.reverse();
		System.out.println("After reverse : " +sb);
		System.out.println("________________________________________");
		//capacity
		System.out.println("Capacity : "+sb.capacity());
		System.out.println("________________________________________");
		//Length
		System.out.println("Length : "+sb.length());
		System.out.println("________________________________________");
		StringBuffer s = new StringBuffer("Hello all");
		System.out.println(s.capacity() + " capacity for Sbuffer is (16+length)");
	}

}
