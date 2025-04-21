package org.example.topik5.task1_1;

public class Main {
    public static void main(String[] args) {
        // Create three Pizza objects as specified
        Pizza pizza1 = new Pizza("Small", "Ham and Pineapple", 12.00, 10.00);
        Pizza pizza2 = new Pizza("Medium", "Chicken and Mushroom", 14.00, 12.00);
        Pizza pizza3 = new Pizza("Large", "Tuna and Sweetcorn", 16.00, 14.00);

        // Display information about each pizza using toString method
        System.out.println("Pizza 1:");
        System.out.println(pizza1.toString());
        System.out.println("\nMessage when eating pizza 1: " + pizza1.eat());

        System.out.println("\nPizza 2:");
        System.out.println(pizza2.toString());
        System.out.println("\nMessage when eating pizza 2: " + pizza2.eat());

        System.out.println("\nPizza 3:");
        System.out.println(pizza3.toString());
        System.out.println("\nMessage when eating pizza 3: " + pizza3.eat());
    }
}
