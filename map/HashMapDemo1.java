package com.evergent.corejava.map;
// index 11
import java.util.HashMap;
//will accept any type of key and any type of values(can also use generics to specify)
//Doesn't accept duplicate key if given it will take but stores latest value only
//Will accept duplicate values
//Will accept null key(not duplicate) and null value(duplicate)
// order of insertion is not preserved
//Generics can be of anytype <String,Integer>
public class HashMapDemo1 {

	public static void main(String[] args) {
	HashMap mymap = new HashMap();
	mymap.put(100,"Aashritha");
	mymap.put(200,"Aashritha");
	mymap.put("abc","Aashritha");
	mymap.put(300,244556);
	mymap.put(null, null);
	mymap.put(400, null);
	//mymap.put(abc,244556);
	System.out.println(mymap);
	
	System.out.println(mymap.containsValue(100));
	mymap.replace(300,"Three");
	System.out.println(mymap);
	System.out.println("Remove : "+mymap.remove(1000,"Aashritha"));
	System.out.println(mymap);
	}

}
