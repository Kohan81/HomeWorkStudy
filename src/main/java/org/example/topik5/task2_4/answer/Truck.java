package org.example.topik5.task2_4.answer;

public class Truck extends Vehicle {

    // Instance Variable
    private boolean isTrailer;

    // Constructors
    public Truck(String manufacturer, float engineSize, String registrationNo, boolean NCT){
        super(manufacturer,engineSize,registrationNo,NCT);
    }

    public Truck(String manufacturer, float engineSize, String registrationNo){
        this(manufacturer,engineSize,registrationNo,false);
    }

    public Truck(String manufacturer, float engineSize){
        this(manufacturer,engineSize,"not specified",false);
    }

    public Truck(String manufacturer){
        this(manufacturer,0.0f,"not specified",false);
    }

    public Truck(){
        this("not specified",0.0f,"not specified",false);
    }

    // Setters and Getters
    public void setTrailer(boolean isTrailer){
        this.isTrailer = isTrailer;
    }

    public boolean getTrailer(){
        return isTrailer;
    }

    // Override
    public String brake(){
        return "Truck Braking...";
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Has Trailer? " + isTrailer;
    }

}// class