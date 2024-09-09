package com.evergent.corejava.javabeans;

import java.io.Serializable;
//Scenario 2 :- Set value by setter and retrieve by toString
class StudentBean implements Serializable{
	
	 private int sno;
	 private String sname;
	 private String address;
	 
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return "Sno : "+sno +" Sname : "+sname+" Address : "+address;
	}
}
public class StudentBeanImpl {

	public static void main(String[] args) {
		 StudentBean stud = new  StudentBean ();
		 //Setting value to the bean by Setter
		 stud.setSno(9801);
		 stud.setSname("Niash");
		 stud.setAddress("Nellore");
		//Getting value from bean by toString
		 System.out.println(stud);
	}

}
