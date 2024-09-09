package com.evergent.corejava.aashritha.application4;

import java.util.Random;
import java.util.Scanner;

public abstract  class Restaurant implements Hotel{
	
	static int Quantity, price =0,total=0;
	
	Scanner obj = new Scanner(System.in);
	Random r = new Random();
	
	public void placeOrder() {
		
		System.out.println("Great!! ");
		System.out.println("We would like to know where are you now?");
		System.out.println("1.Restaurant\n2.Outside");
		System.out.println("\nSelect your option : ");
		
		int num1= obj.nextInt();
		 if(num1==1) {
			 restaurant();
		 }
		 if(num1==2) {
			 outSide();
		 }
	}
	
	public void restaurant() {
		
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
	}
	
		}
	}
	
	public void outSide() {
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
	
}

