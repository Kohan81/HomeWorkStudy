package org.example.topik5.task2_1.answer;

public class Test{

    public static void main(String args[]){

        // Create a number of objects from the IQ class
        IQ obj1 = new IQ();
        obj1.setName("James Devine");
        obj1.setAge(46);
        obj1.setIQScore(87);
        System.out.println(obj1.toString());
        System.out.println("");
        System.out.println(obj1.IQReport());

        System.out.println();

        IQ obj2 = new IQ();
        obj2.setName("Helena Smith");
        obj2.setAge(126);
        obj2.setIQScore(101);
        System.out.println(obj2.toString());
        System.out.println("");
        System.out.println(obj2.IQReport());

        System.out.println();

        IQ obj3 = new IQ();
        obj3.setName("Daniel Jones");
        obj3.setAge(27);
        obj3.setIQScore(1510);
        System.out.println(obj3.toString());
        System.out.println("");
        System.out.println(obj3.IQReport());

        System.out.println();

    }// main

}// class