package org.example.topik5.task2_3.answer;

public class Main {

    public static void main(String args[]){

        // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        // Adult:
        Adult a = new Adult();

        // Set Human Inherited Instance Variables
        a.setName("Billy White");
        a.setAge(30);
        a.setGender("male");
        a.setHeight(6.5f);
        a.setWeight(11.00f);

        // Set Adult Instance Variables
        a.setPPSNo("5645614F");
        a.setOccupation("Software Developer");
        a.setIsMarried(true);
        a.setIsCarOwner(true);

        System.out.println(a.toString());

        System.out.println(a.eat()); // inherited from Human

        System.out.println(a.drive()); // A method particular to an Adult

        System.out.println();

        // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

        // Child under 5
        Child c1 = new Child();

        c1.setName("Frank Davis");
        c1.setAge(3);
        c1.setGender("male");
        c1.setHeight(1.5f);
        c1.setWeight(3.00f);

        System.out.println(c1.toString());
        System.out.println(c1.eat()); // inherited from Human
        System.out.println(c1.swim()); // overridden method

        System.out.println();

        // Baby
        Baby b1 = new Baby();
        b1.setName("Gillian Taylor");
        b1.setAge(1);
        b1.setGender("female");
        b1.setHeight(0.6f);
        b1.setWeight(1.00f);
        b1.setIsTeething(true);

        System.out.println(b1.toString());
        System.out.println(b1.sleep());
        System.out.println(b1.swim()); // overridden method

    }// main

}// class
