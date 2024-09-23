package com.evergent.corejava.controller;

import com.evergent.corejava.bean.DishBean;
import com.evergent.corejava.service.DishService;
import com.evergent.corejava.service.MenuService;
import com.evergent.corejava.service.OrderService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        MenuService menuService = new MenuService();
        OrderService orderService = new OrderService();
        DishService dishService = new DishService();

        while (true) {
        	System.out.println("\t\t\t-----Welcome to Evansh Restaurant-----");
            System.out.println("\n1. Add Dish to Menu");
            System.out.println("2. Display Menu");
            System.out.println("3. Remove Dish from Menu");
            System.out.println("4. Add Dish to Order");
            System.out.println("5. Remove Dish from Order");
            System.out.println("6. Display Order");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = sin.nextInt();

            switch (choice) {
                case 1:
                    DishBean newDish = new DishBean();
                    System.out.print("Enter Dish ID: ");
                    newDish.setDishId(sin.nextInt());
                    System.out.print("Enter Dish Name: ");
                    newDish.setName(sin.next());
                    System.out.print("Enter Dish Price: ");
                    newDish.setPrice(sin.nextFloat());
                    menuService.addToMenu(newDish);
                    break;
                case 2:
                    menuService.displayMenu();
                    break;
                case 3:
                    System.out.print("Enter Dish ID to remove: ");
                    menuService.removeFromMenu(sin.nextInt());
                    break;
                case 4:
                    System.out.print("Enter Dish ID to add to order: ");
                    DishBean dishToOrder = menuService.getDishById(sin.nextInt());
                    if (dishToOrder != null) {
                        orderService.addToOrder(dishToOrder);
                    } else {
                        System.out.println("Dish not found in menu.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Dish ID to remove from order: ");
                    orderService.removeFromOrder(sin.nextInt());
                    break;
                case 6:
                    orderService.displayOrder();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
