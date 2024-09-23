package com.evergent.corejava.service;

import com.evergent.corejava.DAO.DishDAO;
import com.evergent.corejava.bean.DishBean;

import java.util.ArrayList;
import java.util.List;

public class MenuService {
    private DishDAO dishDAO = new DishDAO();
    private List<DishBean> menu = new ArrayList<>();

    public void addToMenu(DishBean dish) {
        int result = dishDAO.addDish(dish);
        if (result > 0) {
            menu.add(dish);
            System.out.println("Dish added to menu: " + dish.getName());
        } else {
            System.out.println("Failed to add dish.");
        }
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (DishBean dish : menu) {
            System.out.println(dish.getDishId() + ": " + dish.getName() + " - $" + dish.getPrice() + " (" + dish.getCategory() + ")");
        }
    }

    public void removeFromMenu(int dishId) {
        DishBean toRemove = null;
        for (DishBean dish : menu) {
            if (dish.getDishId() == dishId) {
                toRemove = dish;
                break;
            }
        }
        if (toRemove != null) {
            menu.remove(toRemove);
            System.out.println("Removed dish from menu: " + toRemove.getName());
        } else {
            System.out.println("Dish not found in menu.");
        }
    }

    public DishBean getDishById(int dishId) {
        return dishDAO.getDishById(dishId);
    }
}
