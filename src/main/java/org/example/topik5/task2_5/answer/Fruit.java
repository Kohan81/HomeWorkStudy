package org.example.topik5.task2_5.answer;

public class Fruit{
    private String name;
    private String colour;
    private String origin;
    // other fields...

    public Fruit(String name, String colour, String origin){
        this.name=name;
        this.colour=colour;
        this.origin=origin;
    }

    // Accessor and Mutator methods

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setColour(String colour){
        this.colour=colour;
    }

    public String getColour(){
        return colour;
    }

    public void setOrigin(String origin){
        this.origin=origin;
    }

    public String getOrigin(){
        return origin;
    }

    public String peel(){
        return "Peeling slowly..";
    }

    // other methods..

    public String toString(){
        return "Name: " + name + " " + "Colour: " + colour + " " + "Origin: " + origin;
    }
}