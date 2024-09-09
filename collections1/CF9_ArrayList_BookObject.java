package com.evergent.corejava.collections1;
import java.util.ArrayList;

class Book{
	String name;
	public Book(String name) {
		this.name=name;
	}
	public String toString() {
		return name;
	}
}

public class CF9_ArrayList_BookObject {
	public static void main(String[] args) {
		
		Book b1= new Book("CoreJava");
		Book b2= new Book("Let us c");
		Book b3= new Book("Programming Index java");
		
		ArrayList mylist= new ArrayList();
		mylist.add(b1);
		mylist.add(b2);
		mylist.add(b3);
		System.out.println(mylist);	
	}
}
