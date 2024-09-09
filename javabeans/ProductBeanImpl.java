package com.evergent.corejava.javabeans;

import java.io.Serializable;
//Scenario 2 :- Set value by constructor and retrieve by getter
class ProductBean implements Serializable{
	 private int pno;
	 private String pname;
	 private String paddress;
	public ProductBean(int sno, String sname, String address) {
		super();
		this.pno = sno;
		this.pname = sname;
		this.paddress = address;
	}
	public int getPno() {
		return pno;
	}
	public String getPname() {
		return pname;
	}
	public String getAddress() {
		return paddress;
	}
	
}
public class ProductBeanImpl {
	public static void main(String[] args) {
	   //Setting value to the bean by Constructor
	   ProductBean prod = new ProductBean(509,"Aashritha Evangiline","Hyderabad");
	   //Getting value from bean by Getter
	   System.out.println(prod.getPno());
	   System.out.println(prod.getPname());
	   System.out.println(prod.getAddress());
	}
}
