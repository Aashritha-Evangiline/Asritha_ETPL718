package com.evergent.corejava.io.serialization;
// index 17
import java.io.Serializable;
//To send data of java program into a file that data has to be serialized

public class Product implements Serializable {
	private int pid;
	private String pname;
	private double price;
	public Product() {
		
	}

	public Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
	public int getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public double getPrice() {
		return price;
	}
}
