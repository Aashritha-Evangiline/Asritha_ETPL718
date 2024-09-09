package com.evergent.corejava.aashritha.application4;

import java.util.Random;
import java.util.Scanner;

public abstract class BanquetService extends Restaurant {
	Scanner obj = new Scanner(System.in);
	Random r = new Random();
	static String occasion; static String name; static char size; static int days; static int pCount; String nSize="";String date="";
	String pType="";
	
	static int Quantity, price =0,total=0;
	//Implemented methods
	public void banquetService()
	{
		System.out.println("Thank you for opting our Banquet Services \n");
		System.out.println("\nWe are providing : \n");
		System.out.println("BH -- Banquet Bliss\nBF -- Feast&Celebrate");
		System.out.println("\n**Note**\nBanquet Bliss is only for Banquet hall service & \nFeast&Celebrate is for Banquet hall service followed by Food" );
		System.out.println("\nPlease select your option : ");
		String banquet = obj.nextLine();
		
		String h ="bh"; String h1 ="BH";
		String f ="bf"; String f1 ="BF";
		
		if(banquet.equals(h)||banquet.equals(h1)) {
			banquetBliss();
		}
		
		else if(banquet.equals(f)||banquet.equals(f1)){
			feastCelebrate();
			
		}
	}
	
	//Local methods
	 public void banquetBliss() {
		 
		System.out.println("You have choosen Banquet Bliss\n");
		System.out.println("Please fill the required details to book banquet hall");
		 // Size, No.of days , Occasion, count,name
		
		System.out.println("Enter your name : ");
		name=obj.nextLine();
		
		System.out.println("Enter the Occasion : ");
		occasion=obj.nextLine();
		
		System.out.println("Enter date of Event(dd/mm/yyyy) :");
		date=obj.nextLine();
		
		System.out.println("Banquet Hall Size \n S-- Small(100-200 persons)---25000rs\n M-- Medium(300-700 persons)---50000rs\n B-- Big(1000-2000 persons)---150000rs");
		System.out.println("Select size : "); 
		size=obj.next().charAt(0);
		      if(size=='S'||size=='s') {
		    	  System.out.println("You have selected Small BH");
		    	  price = 25000;
		    	  nSize="Small";
		      }
		      else if(size=='M'||size=='m') {
		    	  System.out.println("You have selected Medium BH");
		    	  price = 50000;
		    	  nSize="Medium";
		      }
		      if(size=='B'||size=='b') {
		    	  System.out.println("You have selected Big BH");
		    	  price = 150000;
		    	  nSize="Big";
		      }
		
		System.out.println("Enter For how many days you require hall : ");
		days = obj.nextInt();
		  total =price*days;
		System.out.println("Thank you for giving all the details\n");
		System.out.println("Press P for payment : ");
		char p = obj.next().charAt(0);
		if(p=='p'||p=='P') {
			paymentBH();
			
		}											
		
	}
	//Local methods
	public void paymentBH() {
		int r3=r.nextInt(1000,99999);
		System.out.println("_______________________**BILL**_____________________________");
		System.out.println("Invoice Id   :  "+r3+ "\t\tEvansh,Hyderabad,9876543210");
		System.out.println("\n\t\t Name          : "+name);
		System.out.println("\t\t Occasionc     : "+occasion);
		System.out.println("\t\t Date of Event : "+date);
		System.out.println("\t\t BH Size       : "+nSize );
		System.out.println("\t\t No.Days       : "+days);
		System.out.println("\t\t-------------------------------");
		System.out.println("\t\t Total Amount  : "+total);
		System.out.println("\t\t_______________________________");
		System.out.println("Thanks for choosing us! Can't wait to see you on "+date +" :)");
		
	}
	
	public void feastCelebrate() {
		System.out.println("You have choosen Feast&Celebrate\n");
		System.out.println("Please fill the required details to book banquet hall");
		 // Size, No.of days , Occasion, count,name
		
		System.out.println("\nEnter your name : ");
		name=obj.nextLine();
		
		System.out.println("Enter the Occasion : ");
		occasion=obj.nextLine();
		
		System.out.println("Enter date of Event(dd/mm/yyyy) :");
		date=obj.nextLine();
		
		System.out.println("Banquet hall size \n S-- Small(100-200 persons)---25000rs\n M-- Medium(300-700 persons)---50000rs\n B-- Big(1000-2000 persons)---150000rs");
		System.out.println("Select size : ");   
		size=obj.next().charAt(0);
		      if(size=='S'||size=='s') {
		    	  System.out.println("You have selected Small BH\n");
		    	  price = 25000;
		    	  nSize="Small";
		      }
		      else if(size=='M'||size=='m') {
		    	  System.out.println("You have selected Medium BH\n");
		    	  price = 50000;
		    	  nSize="Medium";
		      }
		      if(size=='B'||size=='b') {
		    	  System.out.println("You have selected Big BH\n");
		    	  price = 150000;
		    	  nSize="Big";
		      }
    	System.out.println("Enter F to go into FOOD MENU : ");
    	char food =obj.next().charAt(0);
    	if(food=='F'|| food=='f') {
    		
    		System.out.println("--------MENU--------\n");
    		System.out.println("1. Veg");
    		System.out.println("2. Non-Veg");
    		System.out.println("3. Veg & Non-Veg");
    		
    		System.out.println("\n Choose your option :");
    		int fnum = obj.nextInt();
    		if(fnum==1) {
    			System.out.println("\n You have choosen veg");
    			
    			System.out.println("Veg Course");
    			System.out.println("C-- Classic plate ------ 250rs/plate");
    			System.out.println("P-- Premium plate ------ 500rs/plate");
    			System.out.println("L-- Luxury plate  ------ 750rs/plate");
    			
    			System.out.println("\n Select your plate : ");
    			char plate = obj.next().charAt(0);
    			if(plate=='c'|| plate=='C') {
    				System.out.println("You have choosen Classic plate");
    				price=250;
    				pType =  "Classic Plate";
    			}
    			
    			else if(plate=='P'|| plate=='p') {
    				System.out.println("You have choosen Premium plate");
    				price=500;
    				pType =  "Premium Plate";
    			}
    			
    			else if(plate=='L'|| plate=='l') {
    				System.out.println("You have choosen Luxury plate");
    				price=750;
    				pType =  "Luxury Plate";
    			}
    			
    			
    			System.out.println("Enter people count : ");
    			pCount=obj.nextInt();
    			System.out.println("Enter For how many days you require the hall : ");
				days = obj.nextInt();
				
				total= (size+(price*pCount))*2;

				System.out.println("Thank you for giving all the details\n");
				System.out.println("Press P for payment :");
				char p = obj.next().charAt(0);
				if(p=='p'||p=='P') {
					int r3=r.nextInt(1000,99999);
					System.out.println("_______________________**BILL**_____________________________");
					System.out.println("Invoice Id   :  "+r3+ "\t\tEvansh,Hyderabad,9876543210");
					System.out.println("\n\t\t Name          : "+name);
					System.out.println("\t\t Occasionc     : "+occasion);
					System.out.println("\t\t Date of Event : "+date);
					System.out.println("\t\t BH Size       : "+nSize );
					System.out.println("\t\t Food Type     : Veg");
					System.out.println("\t\t Plate Type    : "+pType);
					System.out.println("\t\t Persons Count : "+pCount);
					System.out.println("\t\t No.Days       : "+days);
					System.out.println("\t\t-------------------------------");
					System.out.println("\t\t Total Amount  : "+total);
					System.out.println("\t\t_______________________________");
					System.out.println("Thanks for choosing us! We promise an incredibe experience on "+date);
				}	               			             			
    		}
    		
    		   else if(fnum==2) {
    			System.out.println("\n You have choosen Non-Veg");
    			
    			System.out.println("Veg Course");
    			System.out.println("C-- Classic plate ------ 399rs/plate");
    			System.out.println("P-- Premium plate ------ 699rs/plate");
    			System.out.println("L-- Luxury plate  ------ 999rs/plate");
    			
    			System.out.println("\n Select your plate : ");
    			char plate = obj.next().charAt(0);
    			if(plate=='c'|| plate=='C') {
    				System.out.println("You have choosen Classic plate");
    				price=399;
    				pType =  "Classic Plate";
    			}
    			
    			else if(plate=='P'|| plate=='p') {
    				System.out.println("You have choosen Premium plate");
    				price=599;
    				pType =  "Premium Plate";
    			}
    			
    			else if(plate=='L'|| plate=='l') {
    				System.out.println("You have choosen Luxury plate");
    				price=999;
    				pType =  "Luxury Plate";
    			}
    			
    			
    			System.out.println("Enter people count : ");
    			pCount=obj.nextInt();
    			System.out.println("Enter For how many days you require the hall :");
				days = obj.nextInt();
				
				total= (size+(price*pCount))*2;

				System.out.println("Thank you for giving all the details\n");
				System.out.println("Press P for payment :");
				char p = obj.next().charAt(0);
				if(p=='p'||p=='P') {
					int r3=r.nextInt(1000,99999);
					System.out.println("_______________________**BILL**_____________________________");
					System.out.println("Invoice Id   :  "+r3+ "\t\tEvansh,Hyderabad,9876543210");
					System.out.println("\n\t\t Name          : "+name);
					System.out.println("\t\t Occasionc     : "+occasion);
					System.out.println("\t\t Date of Event : "+date);
					System.out.println("\t\t BH Size       : "+nSize );
					System.out.println("\t\t Food Type     : Non-Veg");
					System.out.println("\t\t Plate Type    : "+pType);
					System.out.println("\t\t Persons Count : "+pCount);
					System.out.println("\t\t No.Days       : "+days);
					System.out.println("\t\t-------------------------------");
					System.out.println("\t\t Total Amount  : "+total);
					System.out.println("\t\t_______________________________");
					System.out.println("Thanks for choosing us! We promise an incredibe experience on "+date);

				}
    		}
    		
    		   else if(fnum==3) {
       			System.out.println("\n You have choosen Veg &Non-Veg");
       			
       			System.out.println("Veg Course");
       			System.out.println("C-- Classic plate ------ 499rs/plate");
       			System.out.println("P-- Premium plate ------ 799rs/plate");
       			System.out.println("L-- Luxury plate  ------ 1099rs/plate");
       			
       			System.out.println("\n Select your plate : ");
       			char plate = obj.next().charAt(0);
       			if(plate=='c'|| plate=='C') {
       				System.out.println("You have choosen Classic plate");
       				price=499;
       				pType =  "Classic Plate";
       			}
       			
       			else if(plate=='P'|| plate=='p') {
       				System.out.println("You have choosen Premium plate");
       				price=799;
       				pType =  "Premium Plate";
       			}
       			
       			else if(plate=='L'|| plate=='l') {
       				System.out.println("You have choosen Luxury plate");
       				price=1099;
       				pType =  "Luxury Plate";
       			}
       			
       			
       			System.out.println("Enter people count : ");
       			pCount=obj.nextInt();
       			System.out.println("Enter For how many days you require the hall : ");
					days = obj.nextInt();
					
					total= (size+(price*pCount))*2;

					System.out.println("Thank you for giving all the details\n");
					System.out.println("Press P for payment :");
					char p = obj.next().charAt(0);
					if(p=='p'||p=='P') {
						int r3=r.nextInt(1000,99999);
						System.out.println("_______________________**BILL**_____________________________");
						System.out.println("Invoice Id   :  "+r3+ "\t\tEvansh,Hyderabad,9876543210");
						System.out.println("\n\t\t Name          : "+name);
						System.out.println("\t\t Occasionc     : "+occasion);
						System.out.println("\t\t Date of Event : "+date);
						System.out.println("\t\t BH Size       : "+nSize );
						System.out.println("\t\t Food Type     : Veg & Non-Veg");
						System.out.println("\t\t Plate Type    : "+pType);
						System.out.println("\t\t Persons Count : "+pCount);
						System.out.println("\t\t No.Days       : "+days);
						System.out.println("\t\t-------------------------------");
						System.out.println("\t\t Total Amount  : "+total);
						System.out.println("\t\t_______________________________");
						System.out.println("Thanks for choosing us! We promise an incredibe experience on "+date);
						
					}
       		}
    		   else {
    			   System.out.println("You have choosed wrong option :(   Please try again!!");
    		   }
    	}
	}
	

}
