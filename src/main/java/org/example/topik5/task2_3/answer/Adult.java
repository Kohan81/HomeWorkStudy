package org.example.topik5.task2_3.answer;

public class Adult extends Human {

    // Attributes:
    private String ppsNo;
    private String occupation;
    private boolean isMarried;
    private boolean isCarOwner;

    // Setter and Getter methods
    public void setPPSNo(String ppsNo){
        this.ppsNo = ppsNo;
    }// method

    public String getPPSNo(){
        return ppsNo;
    }// method

    public void setOccupation(String occupation){
        this.occupation = occupation;
    }// method

    public String getOccupation(){
        return occupation;
    }// method

    public void setIsMarried(boolean isMarried){
        this.isMarried = isMarried;
    }// method

    public boolean getIsMarried(){
        return isMarried;
    }// method

    public void setIsCarOwner(boolean isCarOwner){
        this.isCarOwner = isCarOwner;
    }// method

    public boolean getIsCarOwner(){
        return isCarOwner;
    }// method


    // Behaviours:
    public String drive(){
        return "Driving a car safely..";
    }

    public String procreate(){
        return "Procreating...";
    }

    public String toString(){
        return super.toString() + "\n" +
                "PPS No: " + ppsNo + "\n" +  "Occupation: " + occupation  + "\n" +
                "Marriage Status:" + isMarried + "\n" + "Car Owner: " + isCarOwner;
    }// class

}// class