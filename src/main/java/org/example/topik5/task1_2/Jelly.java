package org.example.topik5.task1_2;

public class Jelly {

    String manufacturer;
    float price;
    String flavour;
    float noCalories;
    String expiryDate;

    public Jelly(String manufacturer, float price, String flavour, float noCalories, String expiryDate) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.flavour = flavour;
        this.noCalories = noCalories;
        this.expiryDate = expiryDate;
    }

    public String setInstructions(){
        return "Leave Jelly to set in a cool environment for 1hr";
    }

    @Override
    public String toString() {
        return  "Manufacturer = " + manufacturer + "\n" +
                "Price = " + price + "\n" +
                "Flavour = " + flavour + "\n" +
                "No of Calories = " + noCalories + "\n" +
                "Expiry Date = " + expiryDate + "\n";
    }
}
