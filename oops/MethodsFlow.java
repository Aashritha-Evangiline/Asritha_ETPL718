package com.evergent.corejava.oops;

public class MethodsFlow {

	
		
		// // No Arguments with no return type
		
		public void display() {
			System.out.println("No Arguments with no return type");
		}
		
		// Arguments with no return type
		    
		public void add(int x, int y) {
			System.out.println("Addition : "+ x+y);
			System.out.println("Arguments with no return type");
		}
		
		
		// No Arguments with  return type
				
				public int age() {
					int age=22;
					
					System.out.println("No Arguments with  return type");
					
					return age;
					
				}
				
		//  Arguments with  return type
		  public String myName(String name) {
			  System.out.println("Arguments with  return type");
			  
			  return name;
		  }
		
		
		public static void main(String[] args) {
		
		  MethodsFlow mf = new MethodsFlow();
		  
		  mf.display();
		  System.out.println("_______________________");
		  mf.add(10,20);
		  System.out.println("_______________________");
		  System.out.println(mf.age());
		  System.out.println("_______________________");
		  
		 String name= mf.myName("Aashritha");
		 System.out.println(name);
		  System.out.println("_______________________");
	}

}
