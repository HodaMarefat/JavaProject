package com.fwrp.model;

public class Transaction {
    private int id;
    private User buyer; // Assuming User class has a userType to distinguish consumers
    private FoodItem item;
    private int quantity;
    private double discountRate; // Represented as a percentage (e.g., 10 for 10%)
    private double totalPrice; // Calculated as (item price - discount) * quantity

    // Default constructor
    public Transaction() {
    }

    // Parameterized constructor
    public Transaction(int id, User buyer, FoodItem item, int quantity, double discountRate) {
        this.id = id;
        this.buyer = buyer;
        this.item = item;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.totalPrice = calculateTotalPrice(item.getPrice(), quantity, discountRate);
    }

    // Method to calculate total price
    private double calculateTotalPrice(double itemPrice, int quantity, double discountRate) {
        double discountAmount = itemPrice * (discountRate / 100);
        return (itemPrice - discountAmount) * quantity;
    }

    // Getters
    public int getId() {
        return id;
    }

    public User getBuyer() {
        return buyer;
    }

    public FoodItem getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public void setItem(FoodItem item) {
        this.item = item;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
        // Recalculate total price whenever the discount rate changes
        this.totalPrice = calculateTotalPrice(this.item.getPrice(), this.quantity, this.discountRate);
    }

    //  totalPrice wouldn't have a setter as it's derived from other fields
}
