package com.evergent.corejava.DAO;

import java.sql.*;

public class RestaurantDB {
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/restaurant", "root", "admin");
    }
}
