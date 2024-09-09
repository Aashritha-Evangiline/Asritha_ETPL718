package com.evergent.corejava.io.serialization;
//index 19
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializableData {

	public static void main(String[] args) {
		try {
			Product p = new Product();
	FileInputStream fis = new FileInputStream("C://Users//Asritha.Butty//Desktop//Core Java//Serialization//ProductTrail.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);	
	
	while((p=(Product)ois.readObject())!=null) {
		System.out.println("Product data : "+p.getPid()+ p.getPname()+ p.getPrice());
	}
		}
		catch(Exception e) {
			System.out.println("End of file");
		}

	}

}
