package com.evergent.corejava.map;
//index 12
import java.util.HashMap;
import java.util.Hashtable;
//will accept any type of key and any type of values(can also use generics to specify)
//Doesn't accept duplicate key if given it will take but stores latest value only
//Will accept duplicate values
//Will not accept null key and null value
// order of insertion is not preserved
//Generics can be of anytype <String,Integer>
//Different way using for each loop object.ketSet() and object.values after object
public class HashTableDemo2 {

	public static void main(String[] args) {
	Hashtable mymap = new Hashtable();
	mymap.put(100,"Aashritha");
	mymap.put(200,"Aashritha");
	mymap.put(100,"Aashri");
	mymap.put("abc","Aashritha");
	mymap.put(300,244556);
	//mymap.put(null, null);
	//mymap.put(400, null);
	//mymap.put(abc,244556);
	System.out.println(mymap);
	
	System.out.println(mymap.containsValue(100));
	mymap.replace(300,"Three");
	System.out.println(mymap);
	System.out.println("Remove : "+mymap.remove(1000,"Aashritha"));
	System.out.println(mymap);
	//Different way using for each loop put.ketSet() after object
		for(Object i : mymap.keySet()) {
			System.out.println(i);
	}
		
	}

}
