package com.fwrp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
    
    // Database URL
    private static final String DB_URL = "jdbc:mysql://localhost:3306/javafinalproject";
    
    // Database credentials
    private static final String USER = "root";
    private static final String PASS = "Zelat1&Mys";
    
    static {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static Connection getConnection() throws SQLException {
        // Setup the connection with the DB
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
}
