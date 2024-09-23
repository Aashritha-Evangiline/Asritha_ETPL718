package com.evergent.corejava.service;

import com.evergent.corejava.bean.DishBean;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<DishBean> order = new ArrayList<>();

    public void addToOrder(DishBean dish) {
        order.add(dish);
        System.out.println("Added to order: " + dish.getName());
    }

    public void removeFromOrder(int dishId) {
        DishBean toRemove = null;
        for (DishBean dish : order) {
            if (dish.getDishId() == dishId) {
                toRemove = dish;
                break;
            }
        }
        if (toRemove != null) {
            order.remove(toRemove);
            System.out.println("Removed from order: " + toRemove.getName());
        } else {
            System.out.println("Dish not found in order.");
        }
    }

    public void displayOrder() {
        System.out.println("Order:");
        float total = 0;
        for (DishBean dish : order) {
            System.out.println(dish.getDishId() + ": " + dish.getName() + " - $" + dish.getPrice());
            total += dish.getPrice();
        }
        System.out.println("Total: $" + total);
    }
}
