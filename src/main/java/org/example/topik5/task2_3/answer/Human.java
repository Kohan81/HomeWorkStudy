package org.example.topik5.task2_3.answer;

public class Human {

    // Attributes:
    private String name;
    private int age;
    private String gender;
    private float height;
    private float weight;

    // Setters and Getters
    public void setName(String name){
        this.name = name;
    }// method

    public String getName(){
        return name;
    }// method

    public void setAge(int age){
        this.age = age;
    }// method

    public int getAge(){
        return age;
    }// method

    public void setGender(String gender){
        this.gender = gender;
    }// method

    public String getGender(){
        return gender;
    }// method

    public void setHeight(float height){
        this.height = height;
    }// method

    public float getHeight(){
        return height;
    }// method

    public void setWeight(float weight){
        this.weight = weight;
    }// method

    public float getWeight(){
        return weight;
    }// method


    // Behaviours:
    public String sleep(){
        return "Sleeping soundly..";
    }

    public String eat(){
        return "Eating slowly and chewing carefully..";
    }

    public String swim(){
        return "Arms rotating and pushing the body forward..";
    }

    public String toString(){
        return "Name: " + name + "\n" +  "Age: " + age  + "\n" +
                "Gender: " + gender + "\n" + "Height: " + height + "\n" + "Weight: " + weight;
    }// class

}// class