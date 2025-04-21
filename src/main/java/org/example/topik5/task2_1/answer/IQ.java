package org.example.topik5.task2_1.answer;

public class IQ{

    // Instance Variables

    private String name;
    private int age;
    private float IQScore;

    // Setter and Getter methods

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        // Data Validation: valid age is between 1-115
        if( ! ( (age < 1) || (age > 115) ) ) {
            this.age = age;
        }

        // After inversion, if the condition above is false then
        // age will retain a default value of 0.
    }
    public float getIQScore() {
        return IQScore;
    }
    public void setIQScore(float iQScore) {
        // Data Validation: A valid IQ score can be assumed to be between 1-200.
        if( ! ( (iQScore < 0) || (iQScore > 200 ) ) ){
            this.IQScore = iQScore;
        }

        // After invocation, if the condition above is false then
        // IQScore will retain a default value of 0.0f;
    }

    // Other Methods

    public String IQReport(){

        if(IQScore < 100){
            return "Your score of " + getIQScore() + " is below average.";
        }else if( (IQScore >= 100) && (IQScore <= 150) ){
            return "Your score of " + getIQScore() + " is above average.";
        }else{
            return "Your score of " + getIQScore() + " is exceptional.";
        }

    }

    public String toString(){
        return "Name: " + name + " " + "Age: " + age + " " + "IQ Score: " + IQScore;
    }

}// class