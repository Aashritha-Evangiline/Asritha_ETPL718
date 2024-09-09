package com.evergent.corejava.oops;

public class MultilevelInheritance extends PersonInfo{
	
	public void show() {
		System.out.println("Local method");
	}

	
		public static void main(String args []) {
			MultilevelInheritance MI = new MultilevelInheritance();
			MI.pD();
			MI.pI();
			MI.show();
			
		}
}


class PersonData {

	
	public void pD() {
		
	System.out.println("PersonData class method  GP");
}
}

class PersonInfo extends PersonData{
	public void pI(){
		System.out.println("PersonInfo class method  P");
		
	}
}
