package org.example.topik5.task2_6.answer;

public class Vegetable{
    private String name;
    private String family;

    public Vegetable(String name, String family){
        this.name=name;
        this.family=family;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setFamily(String family){
        this.family=family;
    }

    public String getFamily(){
        return family;
    }

    public String cook(){
        return "Add to boiling water and leave to simmer for 20 minutes.";
    }

    public String toString(){
        return "Name: " + name + " " + "Family: " + family;
    }
}