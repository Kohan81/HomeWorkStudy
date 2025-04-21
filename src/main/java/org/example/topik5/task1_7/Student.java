package org.example.topik5.task1_7;

public class Student {

    public String firstName;
    public String lastName;
    public byte age;
    public String className;
    public float gradeAverage;
    public String address;

    public Student(String firstName, String lastName, byte age, String className, float gradeAverage, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.className = className;
        this.gradeAverage = gradeAverage;
        this.address = address;
    }

    @Override
    public String toString() {
        return  "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Age: " + age + "\n" +
                "Class Name: " + className + "\n" +
                "Grade Average: " + gradeAverage + "\n" +
                "Address: " + address + "\n";
    }
}