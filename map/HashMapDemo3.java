package com.evergent.corejava.map;
// index 13
import java.util.HashMap;
//Specifying Generics
public class HashMapDemo3 {

	public static void main(String[] args) {
	HashMap<String,String> capitalCities = new HashMap <String,String>();
	capitalCities.put("India","Delhi");
	capitalCities.put("USA","Washington DC");
	capitalCities.put("Germany","Berlin");
	capitalCities.put("India","Delhi");
	capitalCities.put(null,null);
	capitalCities.put("Indi",null);
	//mymap.put(abc,244556);
	System.out.println(capitalCities);
	System.out.println("____________");
	System.out.println(capitalCities.containsValue(100));
	capitalCities.replace("India","New Delhi");
	System.out.println(capitalCities);
	System.out.println("Remove : "+capitalCities.remove(1000,"Aashritha"));
	System.out.println(capitalCities);
	System.out.println("________________");
	
	//Different way using for each loop put.ketSet() after object
	for(String i : capitalCities.keySet()) {
		System.out.println(i);
	}
	}

}
