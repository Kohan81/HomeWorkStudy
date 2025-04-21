package org.example.topik5.task2_4.answer;

public class Vehicle {

    // Instance Variables
    private String manufacturer;
    private float engineSize;
    private String registrationNo;
    private boolean NCT;

    // Constructors
    public Vehicle(String manufacturer, float engineSize, String registrationNo, boolean NCT){
        this.manufacturer = manufacturer;
        this.engineSize = engineSize;
        this.registrationNo = registrationNo;
        this.NCT = NCT;
    }

    public Vehicle(String manufacturer, float engineSize, String registrationNo){
        this(manufacturer,engineSize,registrationNo,false);
    }

    public Vehicle(String manufacturer, float engineSize){
        this(manufacturer,engineSize,"not specified",false);
    }

    public Vehicle(String manufacturer){
        this(manufacturer,0.0f,"not specified",false);
    }

    public Vehicle(){
        this("not specified",0.0f,"not specified",false);
    }

    // Setter and Getter Methods
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public void setEngineSize(float engineSize){
        this.engineSize = engineSize;
    }

    public float getEngineSize(){
        return engineSize;
    }

    public void setRegistrationNo(String registrationNo){
        this.registrationNo = registrationNo;
    }

    public String getRegistrationNo(){
        return registrationNo;
    }

    public void setNCT(boolean NCT){
        this.NCT = NCT;
    }

    public boolean getNCT(){
        return NCT;
    }


    // Instance Methods
    public String accelerate(){
        return "Accelerating..";
    }

    public String brake(){
        return "Vehicle braking..";
    }

    @Override
    public String toString() {
        return "Manufacturer=" + manufacturer + ",\nEngineSize="
                + engineSize + ",\nRegistrationNo=" + registrationNo
                + ",\nNCT=" + NCT;
    }

}// class