package com.evergent.corejava.map;

import java.util.Map;
import java.util.TreeMap;
//In TreeMap key has to be of same datatype and value can be any type
//If we want to specity data to store we can by Generics
// Data is stored in sorted order by key
//null key is not accepted but null value is accepted(duplicate null val also)

//index 14
public class TreeMapDemo4 {

	public static void main(String[] args) {
		//Creating a TreeMap to store StudentRecords
	TreeMap<Integer,String> studentRecords =new TreeMap<>();
	 //Adding student records to the TreeMap
	studentRecords.put(123,"Raju");
	studentRecords.put(200,"Ravi");
	studentRecords.put(100, "Rama");
	studentRecords.put(1, "Kavitha");
	studentRecords.put(10000, null);
	studentRecords.put(500, null);
	//Displaying the TreeMap
	System.out.println("_________________");
	System.out.println(studentRecords);
	System.out.println("___________");
	//Displaying the TreeMap(Sorted by Student id)
	System.out.println("Student Records (Sorted by ID: )");
	for(Map.Entry<Integer,String> entry:studentRecords.entrySet()) {
	    System.out.println("ID : "+entry.getKey()+" Name : "+entry.getValue());
	}
	
	
	
	
//	for(Map.Entry<Integer,String> en : studentRecords.entrySet()) {
//		System.out.println(en.getKey());
//	}
//	
	}

}
