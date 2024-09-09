package com.evergent.corejava.io.serialization;
// index 18
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
//The input you have will be sent to the file but u wont understand it
//To understand that we need to deserialize

public class ProductSerialization {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("C://Users//Asritha.Butty//Desktop//Core Java//Serialization//ProductTrail.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Product p1 = new Product(1,"Lipstick",999);
			Product p2 = new Product(2,"Kajal",299);
			Product p3 = new Product(3,"Ponds Bright Beauty",299);
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			oos.close();
		}
		catch(Exception e) {
			System.out.println("I can handle : "+e);
		}
	}

}
