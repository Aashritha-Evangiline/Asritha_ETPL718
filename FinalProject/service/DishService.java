package com.evergent.corejava.service;

import com.evergent.corejava.DAO.DishDAO;
import com.evergent.corejava.bean.DishBean;

public class DishService {
    private DishDAO dishDAO = new DishDAO();

    public int addDishService(int dishId, String name, float price) {
        String category;
        if (price <= 10) {
            category = "Cheap";
        } else if (price <= 20) {
            category = "Affordable";
        } else {
            category = "Expensive";
        }

        DishBean dishBean = new DishBean();
        dishBean.setDishId(dishId);
        dishBean.setName(name);
        dishBean.setPrice(price);
        dishBean.setCategory(category);

        return dishDAO.addDish(dishBean);
    }
}
