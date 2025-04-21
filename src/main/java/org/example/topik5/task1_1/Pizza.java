package org.example.topik5.task1_1;

public class Pizza {
    // Instance variables
    private String size;
    private String toppings;
    private double diameter;
    private double price;

    // Constructor
    public Pizza(String size, String toppings, double diameter, double price) {
        this.size = size;
        this.toppings = toppings;
        this.diameter = diameter;
        this.price = price;
    }

    // Method to eat the pizza
    public String eat() {
        return "Eat a pizza slowly, it can choke you if you eat it too fast!";
    }

    // toString method to return information about the Pizza
    @Override
    public String toString() {
        return "Size: " + size + "\n" +
                "Toppings: " + toppings + "\n" +
                "Diameter: " + diameter + "\n" +
                "Price: €" + price;
    }
}
