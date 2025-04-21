package org.example.topik5.task2_1;

public class IQ {

    private String name;
    private int age = 0;
    private float iQScore = 0;

    public IQ(String name, int age, float iQScore) {
        this.name = name;
        this.age = age;
        this.iQScore = iQScore;
    }

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
        if (age < 0 || age > 115) {
            age = 0;
        }
        this.age = age;
    }

    public float getiQScore() {
        return iQScore;
    }

    public void setiQScore(float iQScore) {
        if (iQScore < 0 || iQScore > 200) {
            iQScore = 0;
        }
        this.iQScore = iQScore;
    }

    void IQReport(){

        if(iQScore < 100){
            System.out.println("Your IQ score is " + iQScore + " is below of average");

        } else if(iQScore < 150){
            System.out.println("Your IQ score is " + iQScore + " is above average");

        } else if(iQScore < 200){
            System.out.println("Your IQ score is" + iQScore + " is exceptional");
        }
    }

    @Override
    public String toString() {
        return "IQ{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", iQScore=" + iQScore +
                '}';
    }
}
