package com.evergent.corejava.static1;
// Static var modfication reflects globally
public class Static_Globally8 {
	// Strating intialization
	static String name;
	int age;
	// constructor
	Static_Globally8(){
		this.name="DC_Aashritha";
		this.age=22	;		
	}
	Static_Globally8(String name, int age){
	  //this.name=name;  // not intializing
	//this.age=age;   
	}
	
	public void display() {
		System.out.println("Name is : "+ name);
		System.out.println("Age is :"+ age);
	}
	
	public static void main(String[] args) {
		Static_Globally8 sg = new Static_Globally8();
		//default constructor
		sg.display();
		System.out.println("____________");
		Static_Globally8 sg2= new Static_Globally8("Yadidya", 20);
		//para constructor
		sg2.display();
	}
}
