package org.example.topik5.task1_8;

public class Smartphone {

    static int numberOfphone;
    String name;
    String manufacturer;
    float price;
    String releaseDate;
    float creditRemaining;
    boolean isFullyCharged;

    public Smartphone(String name, String manufacturer, float price, String releaseDate,
                      float creditRemaining, boolean isFullyCharged) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.releaseDate = releaseDate;
        this.creditRemaining = creditRemaining;
        this.isFullyCharged = isFullyCharged;
    }

    public void makeCall(String noToCall){
        System.out.println("Dialling number: " + noToCall);
    }

    public void topUpCredit(float topUpAmount){
        creditRemaining += topUpAmount;
        System.out.println("You have successfully topped up by: " + topUpAmount + "\n"
                + "Your new balance is: " + creditRemaining );
    }

    public void charge(){
        isFullyCharged = true;
        System.out.println("The smartphone is now fully re-charged.");
    }

    @Override
    public String toString() {
        return  "Name: " + name + "\n" +
                "Manufacturer: " + manufacturer + "\n" +
                "Price: " + price + "\n" +
                "Release Date: " + releaseDate + "\n" +
                "Credit Remaining: " + creditRemaining + "\n" +
                "Charge Status: " + isFullyCharged + "\n";
    }
}
