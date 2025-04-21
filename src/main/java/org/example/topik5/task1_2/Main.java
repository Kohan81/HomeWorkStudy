package org.example.topik5.task1_2;

public class Main {
    public static void main(String[] args) {

        Jelly jelly1 = new Jelly("Chivery", 3.50f, "Strawberry", 24, "25/06/2016");
        Jelly jelly2 = new Jelly("Nestles", 3.42f, "Banana", 26, "27/07/2016");
        Jelly jelly3 = new Jelly("Danones", 3.00f, "Lemon", 28, "28/06/2015");

        System.out.println(jelly1.toString() +  jelly1.setInstructions());
        System.out.println();
        System.out.println(jelly2.toString() +  jelly2.setInstructions());
        System.out.println();
        System.out.println(jelly3.toString() +  jelly3.setInstructions());
    }
}
