package org.example.topik5.task2_4.answer;

public class Car extends Vehicle {

    // Static / Class Variables
    private static int noCarsProduced;

    // Constructors
    public Car(String manufacturer, float engineSize, String registrationNo, boolean NCT){
        super(manufacturer,engineSize,registrationNo,NCT);
        Car.noCarsProduced++;
    }

    public Car(String manufacturer, float engineSize, String registrationNo){
        this(manufacturer,engineSize,registrationNo,false);
    }

    public Car(String manufacturer, float engineSize){
        this(manufacturer,engineSize,"not specified",false);
    }

    public Car(String manufacturer){
        this(manufacturer,0.0f,"not specified",false);
    }

    public Car(){
        this("not specified",0.0f,"not specified",false);
    }

    // Instance methods

    @Override
    public String brake(){
        return "Car braking...";
    }

    // Static methods
    public static int getNoCarsProduced(){
        return Car.noCarsProduced;
    }

}// class
