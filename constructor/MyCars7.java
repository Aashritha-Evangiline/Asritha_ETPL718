package com.evergent.corejava.constructor;

class Cars{
	String color;
	int maxSpeed;
	
  public Cars() {  // default constructor
		color="White";
		maxSpeed=200;
  }
  public Cars(String color, int maxSpeed) {// Para Con
		 this.color = color;
		this.maxSpeed = maxSpeed;
  } 
  public void display() { // method
	System.out.println("Color is : "+ color);
	System.out.println("maxSpeed is : "+ maxSpeed);
  }
}

public class MyCars7 {
	public static void main(String[] args) {
     // creating objects using different constructors
       Cars car = new Cars();
       car.display();
       Cars car2 = new Cars("black", 250);
       car2.display();
	}
}
