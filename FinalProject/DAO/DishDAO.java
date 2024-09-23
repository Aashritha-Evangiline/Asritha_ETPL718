package com.evergent.corejava.DAO;

import com.evergent.corejava.bean.DishBean;
import java.sql.*;

public class DishDAO {
    public int addDish(DishBean dish) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = RestaurantDB.getConnection();
            String ins_str = "INSERT INTO dishes (dish_id, name, price, category) VALUES (?, ?, ?, ?)";
            pstmt = con.prepareStatement(ins_str);
            pstmt.setInt(1, dish.getDishId());
            pstmt.setString(2, dish.getName());
            pstmt.setFloat(3, dish.getPrice());
            pstmt.setString(4, dish.getCategory());
            int updateCount = pstmt.executeUpdate();
            return updateCount;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return 0;
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Add a method to fetch dish by ID
    public DishBean getDishById(int dishId) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            con = RestaurantDB.getConnection();
            String query = "SELECT * FROM dishes WHERE dish_id = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, dishId);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                DishBean dish = new DishBean();
                dish.setDishId(rs.getInt("dish_id"));
                dish.setName(rs.getString("name"));
                dish.setPrice(rs.getFloat("price"));
                dish.setCategory(rs.getString("category"));
                return dish;
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
