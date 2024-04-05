package com.fwrp.model;

public class FoodItem {
    private int id;
    private String name;
    private String description;
    private int quantity;
    private String status; // For Sale or For Donation
    private double price; // Added price field
    private String category; // New field for category or type

    // Updated constructor with price and category
    public FoodItem(int id, String name, String description, int quantity, String status, double price, String category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.status = status;
        this.price = price;
        this.category = category;
    }

    // Default constructor
    public FoodItem() {
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getStatus() {
        return status;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
