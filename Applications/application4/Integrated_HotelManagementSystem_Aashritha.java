package com.evergent.corejava.aashritha.application4;

import java.util.Scanner;

public class Integrated_HotelManagementSystem_Aashritha {
	
	static {
		System.out.println("          WELCOME TO EVANSH-Aashritha RESTAURANT");
		System.out.println("           A best place to satisfy your Cravings\n");
		System.out.println("*We feel great that you have visited our site*\n\n");
		System.out.println("    Services we provide are?\n");
		System.out.println("\tP---Place Order");
		System.out.println("\tB---Banquet Services");
		System.out.println("\tA---About Us");
	}
     //default constructor
	Integrated_HotelManagementSystem_Aashritha(){
		System.out.println("\nChoose the above options to avail our service : ");
	}
	
			
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		About about = new About();
		Integrated_HotelManagementSystem_Aashritha integrated = new Integrated_HotelManagementSystem_Aashritha();
		
		String m1 =obj.nextLine();
		String o ="p"; String o1 ="P";
		String b ="b"; String b1 ="B";
		String a ="a"; String a1 ="A";
		
		if(m1.equals(o)||m1.equals(o1)) {
			about. placeOrder();
		}
		
		else if(m1.equals(b)||m1.equals(b1)) {
			about.banquetService();
		}
		
		else if(m1.equals(a)||m1.equals(a1)) {
			about.about();
		}
		else {
			System.out.println("Please select correct option");
		}

	}

}
