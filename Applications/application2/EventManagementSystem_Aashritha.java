package com.evergent.corejava.aashritha.application2;

import java.util.Random;
import java.util.Scanner;

public class EventManagementSystem_Aashritha {  // 1 class
	
	enum module1{
		P,B,A
	}
	enum submodue1{
		R,O
	}
	enum submodule1_1{
		Pre,Post
	}
	enum submodule2{
		BH,BF
	}
	enum submodule3{
		S,M,B
	}
	enum submodule4{
		Veg,NonVeg, Veg_and_NonVeg
	}
	enum submodule4_1{
		C,P,L
	}

	public static void main(String[] args) {  // 2 method
		Scanner obj = new Scanner(System.in);
		Random r = new Random();
		
		int Quantity, price =0,total=0;
		
		System.out.println("          WELCOME TO EVANSH-Aashritha RESTAURANT");
		System.out.println("           A best place to satisfy your Cravings\n");
		System.out.println("*We feel great that you have visited our site*\n\n");
		System.out.println("    Services we provide are?\n");
		System.out.println("\tP---Place Order");
		System.out.println("\tB---Banquet Services");
		System.out.println("\tA---About Us");
		
		System.out.println("\nChoose the above options to avail our service : ");
		
		String m1 =obj.nextLine();
		
		switch(module1.valueOf(m1))
		{//3 1st switch
			case P:{   // 4 1st switch case p
				
				System.out.println("Great!! ");
				System.out.println("We would like to know where are you now?");
				System.out.println("1.Restaurant\n2.Outside");
				System.out.println("\nSelect your option : ");
				
				int num1= obj.nextInt();
				 if(num1==1) {
					System.out.println("We are glad that you have visited our place");
					
					while(true) {
					System.out.println("MENU");
					System.out.println("1.Chicken soup  -  150rs\n2.Veg soup  -  130rs\n3.Crispy corn  -  200rs\n4.Chicken lollipop  -  299rs\n5.Chicken drumsticks  - 299rs\n6.Panner butter masala  - 279rs\n7.muglai chicken  -  350rs\n8.Butter naan  -  30rs\n9.Rumali roti  -  25rs\n10.Veg Biriyani  -  250rs\n11.Chicken Biriyani  -  350rs\n12.Mutton Biriyani  -  370rs\n13.Icecream  -  99rs\n14.Apricot delight  -  150rs\n15.Thumbs up  -  40rs");
					System.out.println("\nChoose your order : \n");
					int num2= obj. nextInt();
					
					if(num2==1) {
						System.out.println("Chicken soup is great choice");
						System.out.println("How many do you want? : ");
						Quantity = obj.nextInt();
						price = Quantity *150;
					}
					else if(num2==2) {
						System.out.println("Veg soup is great choice");
						System.out.println("How many do you want? :");
						Quantity = obj.nextInt();
						price = Quantity *130;
					}
					else if(num2==3) {
						System.out.println("Crispy corn is great choice for starters");
						System.out.println("How many do you want? :");
						Quantity = obj.nextInt();
						price = Quantity *200;
					}
					else if(num2==4) {
						System.out.println("Chicken lollipop is an amazing choice");
						System.out.println("How many do you want? : ");
						Quantity = obj.nextInt();
						price = Quantity *299;
					}
					else if(num2==5) {
						System.out.println("Chicken  drumsticks is an amazing choice");
						System.out.println("How many do you want? :");
						Quantity = obj.nextInt();
						price = Quantity *299;
					}
					else if(num2==6) {
						System.out.println("Panner butter masala is an great choice");
						System.out.println("How many do you want? :");
						Quantity = obj.nextInt();
						price = Quantity *279;
					}
					else if(num2==7) {
						System.out.println("Wow you have choosen Muglai Chicken");
						System.out.println("How many do you want? :");
						Quantity = obj.nextInt();
						price = Quantity *350;
					}
					else if(num2==8) {
						System.out.println("BUTTER NAAN tastes great with mugalai chicken");
						System.out.println("How many do you want? :");
						Quantity = obj.nextInt();
						price = Quantity *30;
					}
					else if(num2==9) {
						System.out.println("Rumali roti goes good with paneer butter masala");
						System.out.println("How many do you want? :");
						Quantity = obj.nextInt();
						price = Quantity *25;
					}
					else if(num2==10) {
						System.out.println("Veg Biriyani is a good choice");
						System.out.println("How many do you want? :");
						Quantity = obj.nextInt();
						price = Quantity *250;
					}
					else if(num2==11) {
						System.out.println("Chicken Biriyani is an ultimate choice");
						System.out.println("How many do you want? :");
						Quantity = obj.nextInt();
						price = Quantity *350;
					}
					else if(num2==12) {
						System.out.println("MUTTON BIRIYANI is great choice");
						System.out.println("How many do you want? :");
						Quantity = obj.nextInt();
						price = Quantity *370;
					}
					else if(num2==13) {
						System.out.println("ICECREAM is a coolest choice");
						System.out.println("How many do you want? :");
						Quantity = obj.nextInt();
						price = Quantity *99; 
					}
					else if(num2==14) {
						System.out.println("Apricot delight is a great choice");
						System.out.println("How many do you want? :");
						Quantity = obj.nextInt();
						price = Quantity *150; 
					}
					else if(num2==15) {
						System.out.println("THUMBS UP taste the thunder");
						System.out.println("How many do you want? :");
						Quantity = obj.nextInt();
						price = Quantity *40; 
					
					}
					else {
						System.out.println("Choose from the list");
					}
					
					total = total+price;
					System.out.println("Do you want to order more? ");
					System.out.println("Press S to continue ORDERING or press N to stop :");
					char num4 = obj.next().charAt(0);
					if(num4=='N'|| num4 == 'n') {
						System.out.println("Press B to get the Bill :");
						char c = obj.next().charAt(0);
						if(c=='B' || c=='b') {
							int r1 = r.nextInt(10000,99999);
							System.out.println("\tInvoice Id    :  "+ r1);
						System.out.println("\tYour bill is  :  "+ total);
						System.out.println("Thank you for visiting EVANSH. Hope you had a great experience here!!");
						System.out.println("Visit again!!:)");	
						break;
						}
						
						
						//stop
						
						
						
						
					}
					}
						
				}    // NUM 1 RESTAURANT
				 
				 else if(num1==2) {
						System.out.println("Are you member of Evansh?");
						System.out.println("Press S if you are member or press N if not :" );
						char num3 = obj.next().charAt(0);
						if (num3=='S'|| num3=='s'){
							System.out.println("When would you visit Evansh?");
							System.out.println("1. With in 30 minutes\n2. With in an hour\n3. 2 hours\n4. 3 hours\n5. 5 hours");
							System.out.println("Please select time :");
							int num5 = obj.nextInt();
							if (num5 ==1) {
								System.out.println("You have selected with in 30 minutes");
							}
							else if (num5==2) {
								System.out.println("You have selected with in 1 hour");
							}
							else if (num5==3) {
								System.out.println("You have selected with in 2 hour");
							}
							else if (num5==4) {
								System.out.println("You have selected with in 3 hour");
							}
							else if (num5==5) {
								System.out.println("You have selected with in 5 hour");
							}
							else {
								System.out.println("Invalid option selected");
								System.out.println("Try again"); 
							}
							
							System.out.println("In which way Would you like to Order?\n");
							System.out.println("1.Pre-Order\n2.Order after visiting restaurant");
							System.out.println("\nselect your option :");
							int num6= obj.nextInt();
							if(num6==1) {
								System.out.println("You have choosen Pre-booking");
								while(true) {
									System.out.println("MENU");
									System.out.println("1.Chicken soup  -  150rs\n2.Veg soup  -  130rs\n3.Crispy corn  -  200rs\n4.Chicken lollipop  -  299rs\n5.Chicken drumsticks  - 299rs\n6.Panner butter masala  - 279rs\n7.muglai chicken  -  350rs\n8.Butter naan  -  30rs\n9.Rumali roti  -  25rs\n10.Veg Biriyani  -  250rs\n11.Chicken Biriyani  -  350rs\n12.Mutton Biriyani  -  370rs\n13.Icecream  -  99rs\n14.Apricot delight  -  150rs\n15.Thumbs up  -  40rs");
									System.out.println("\nChoose your order : \n");
									int num7= obj. nextInt();
									
									if(num7==1) {
										System.out.println("Chicken soup is great choice");
										System.out.println("How many do you want? :");
										Quantity = obj.nextInt();
										price = Quantity *150;
									}
									else if(num7==2) {
										System.out.println("Veg soup is great choice");
										System.out.println("How many do you want? :");
										Quantity = obj.nextInt();
										price = Quantity *130;
									}
									else if(num7==3) {
										System.out.println("Crispy corn is great choice for starters");
										System.out.println("How many do you want? :");
										Quantity = obj.nextInt();
										price = Quantity *200;
									}
									else if(num7==4) {
										System.out.println("Chicken lollipop is an amazing choice");
										System.out.println("How many do you want? :");
										Quantity = obj.nextInt();
										price = Quantity *299;
									}
									else if(num7==5) {
										System.out.println("Chicken  drumsticks is an amazing choice");
										System.out.println("How many do you want? :");
										Quantity = obj.nextInt();
										price = Quantity *299;
									}
									else if(num7==6) {
										System.out.println("Panner butter masala is an great choice");
										System.out.println("How many do you want? :");
										Quantity = obj.nextInt();
										price = Quantity *279;
									}
									else if(num7==7) {
										System.out.println("Wow you have choosen Muglai Chicken");
										System.out.println("How many do you want? :");
										Quantity = obj.nextInt();
										price = Quantity *350;
									}
									else if(num7==8) {
										System.out.println("BUTTER NAAN tastes great with mugalai chicken");
										System.out.println("How many do you want? :");
										Quantity = obj.nextInt();
										price = Quantity *30;
									}
									else if(num7==9) {
										System.out.println("Rumali roti goes good with paneer butter masala");
										System.out.println("How many do you want? :");
										Quantity = obj.nextInt();
										price = Quantity *25;
									}
									else if(num7==10) {
										System.out.println("Veg Biriyani is a good choice");
										System.out.println("How many do you want? :");
										Quantity = obj.nextInt();
										price = Quantity *250;
									}
									else if(num7==11) {
										System.out.println("Chicken Biriyani is an ultimate choice");
										System.out.println("How many do you want? :");
										Quantity = obj.nextInt();
										price = Quantity *350;
									}
									else if(num7==12) {
										System.out.println("MUTTON BIRIYANI is great choice");
										System.out.println("How many do you want :?");
										Quantity = obj.nextInt();
										price = Quantity *370;
									}
									else if(num7==13) {
										System.out.println("ICECREAM is a coolest choice");
										System.out.println("How many do you want :?");
										Quantity = obj.nextInt();
										price = Quantity *99; 
									}
									else if(num7==14) {
										System.out.println("Apricot delight is a great choice");
										System.out.println("How many do you want :?");
										Quantity = obj.nextInt();
										price = Quantity *150; 
									}
									else if(num7==15) {
										System.out.println("THUMBS UP taste the thunder");
										System.out.println("How many do you want? :");
										Quantity = obj.nextInt();
										price = Quantity *40; 
									}
									else {
										System.out.println("Choose from the list");
									
									}
									
									total = total+price;
									System.out.println("Do you want to order more? ");
									System.out.println("Press S to continue ORDERING or press N to stop :");
									char num8 = obj.next().charAt(0);
									if(num8=='n'||num8 == 'N') {
										
										System.out.println("Press B to get your bill :");
										char c1 = obj.next().charAt(0);
										if(c1=='B' || c1=='b') {
										System.out.println("Congratulations!! You have  recieved a discount of '250rs' for pre-ordering ");
										System.out.println("\t250rs will be deducted from your final bill\n");
										int r3 = r.nextInt(999,9999);
										System.out.println("\t\t Invoice Id   : "+r3);
										System.out.println("\n\t\tYour bill is :"+ total);
										System.out.println("\t\tAfter discount Your bill is "+ (total-250));
										System.out.println("\nThank you for visiting EVANSH. Hope you had a great experience here!!");
										System.out.println("Visit again!!:)");	
										break;
										}
									}
									}
								
							}
							else if(num6==2) {
								int r2 = r.nextInt(1,500);
								System.out.println("Thank you for reserving your place. Your table number is :" +r2);
								System.out.println("Congratulations!! You have recieved 2 icecreams as complementary for pre-booking \n");
								System.out.println("After visitig Evansh contact with our management they will guide you to your table");
								System.out.println("For more exciting offers like this visit our website www.evansh.com again and make your life easy going");
									
							}
							else {
								System.out.println("Oops You have entered a invalid option. Try again!!!");
							}
						}
						
						else if(num3=='N'|| num3 == 'n') {
							System.out.println("As you are not the member of Evansh, we are sorry to inform you that you are not eligible for this option :(");
							System.out.println("\nIf you to claim this option, please visit our Restaurant and get registered and enjoy many more offers and discounts we provide");
							System.out.println("\nTo know more about Evansh, contact 9876543210 or visit our place in Banjara hills, Hyderabad");
							System.out.println("Have a great day!!");
						}
						
					} 
				 
				 
				 // stop
				 
				 // NUM 2 Outside	
				 
			}       // 4 1st switch case p closing
			break;
			
			case B:{   // 5 1st switch case b
				System.out.println("Thank you for opting our Banquet Services \n");
				System.out.println("\nWe are providing : \n");
				System.out.println("BH -- Banquet Bliss\nBF -- Feast&Celebrate");
				System.out.println("\n**Note**\nBanquet Bliss is only for Banquet hall service & \nFeast&Celebrate is for Banquet hall service followed by Food" );
				System.out.println("\nPlease select your option : ");
				String banquet = obj.nextLine();
				
				String occasion;String name; char size; int days; int pCount; String nSize="";String date="";
				String pType="";
				
				switch(submodule2.valueOf(banquet)) {    //5.1 case B switch
				
				case BH:{
					
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
				}
				break;
				
                case BF:{  // start
                	
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
                			else {
                				System.out.println("OOPS!!!Selected out of list. TRY AGAIN!!");
                				break;
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
                			else {
                				System.out.println("OOPS!!!Selected out of list. TRY AGAIN!!");
                				break;
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
                   			else {
                   				System.out.println("OOPS!!!Selected out of list. TRY AGAIN!!");
                   				break;
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
				}   //stop
                
                
                
				break;
				
				}//5.1 case B switch closing
				
			}       // 5 1st switch case b closing
			break;
			
			case A:{   // 6 1st switch case A
				   System.out.println("-*-*-*-*Welcome to Evansh Restaurant*-*-*-*-" );
				   System.out.println("\nWe treat our customers with atmost priority \n");
				   System.out.println("WE PROVIDE OUR CUSTOMERS WITH\n");
				   System.out.println("->DINE IN"+"\n    - Enjoy our delicious cuisine in-restaurant"+"\n    - Order takeout or delivery for convenience"+"\n    - Book a table online for a seamless experience\n");
				   System.out.println("->BANQUET SERVICES"+ "\n    - Banquet Hall: Host events for up to 2000 guests"+ "\n    - Banquet Hall cum Food:"
				   		+"\n       * Vegetarian delights" +"\n       * Non-vegetarian treats"+"\n       * Combination of both\r\n");
				    
				   System.out.println("-> CONVENIENCE AT YOUR FINGERTIPS");
				   System.out.println("    - Online ordering through our website or mobile app");
				   System.out.println("    - Easy table reservations");
				   
				   System.out.println("\n-> Get IN TOUCH");
				   System.out.println("    - Phone   : 9876543210");
				   System.out.println("    - email   : evansh27@gmail.com");
				   System.out.println("    - Address : Madhapur, Hyderabad ");
				   
				   System.out.println("\n-> EXPERIENCE THE BEST");
				   System.out.println("    - Fine dining");
				   System.out.println("    - Memorable events");
				   System.out.println("    - Convenient services");
			}       // 6 1st switch case A closing
			break;
			
		} //3 1st switch closing

	}//2 method closing

}//1 class closing
