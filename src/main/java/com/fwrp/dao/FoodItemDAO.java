package com.fwrp.dao;

import com.fwrp.model.FoodItem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FoodItemDAO {

    // DataSource class exists and provides a connection
    private DataSource dataSource;

    public FoodItemDAO() {
        dataSource = new DataSource(); //  use dependency injection or JNDI lookup in real applications
    }

    // Method to get all FoodItems from the database
    public List<FoodItem> getAllFoodItems() {
        List<FoodItem> foodItems = new ArrayList<>();
        String sql = "SELECT * FROM FoodItems"; //  a table named FoodItems

        try (Connection conn = dataSource.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                FoodItem item = new FoodItem();
                item.setId(rs.getInt("id"));
                item.setName(rs.getString("name"));
                item.setDescription(rs.getString("description"));
                item.setQuantity(rs.getInt("quantity"));
                item.setStatus(rs.getString("status"));
                item.setPrice(rs.getDouble("price")); // Assuming you have a price column
                item.setCategory(rs.getString("category")); // Assuming you have a category column
                foodItems.add(item);
            }
        } catch (SQLException e) {
            // Handle exceptions (print stack trace is for debugging, should be logged in production)
            e.printStackTrace();
        }
        return foodItems;
    }

    // Method to add a FoodItem to the database
    public void addFoodItem(FoodItem item) {
        String sql = "INSERT INTO FoodItems (name, description, quantity, status, price, category) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, item.getName());
            pstmt.setString(2, item.getDescription());
            pstmt.setInt(3, item.getQuantity());
            pstmt.setString(4, item.getStatus());
            pstmt.setDouble(5, item.getPrice());
            pstmt.setString(6, item.getCategory());
            
            pstmt.executeUpdate();
        } catch (SQLException e) {
            // Handle exceptions
            e.printStackTrace();
        }
    }

    // Implement additional CRUD methods as needed...
}
