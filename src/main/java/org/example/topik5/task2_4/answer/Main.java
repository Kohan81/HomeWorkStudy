package org.example.topik5.task2_4.answer;

public class Main {

    public static void main(String[] args) {

        // Create an object of class type Car using the four-arg constructor.
        Car c1 = new Car("Subaru Hatchback", 53.45f, "89C4545", true);

        System.out.println(c1.toString());

        System.out.println(c1.brake()); // Call an overridden method

        System.out.println(c1.accelerate()); // Call a method of the super class

        System.out.println();

        // Create an object using the setters and getters methods
        Car c2 = new Car();
        c2.setManufacturer("Toyota Carola");
        c2.setEngineSize(45.44f);
        c2.setRegistrationNo("90C4343");
        c2.setNCT(true);

        System.out.println(c2.toString());

        System.out.println(c2.brake()); // Call an overridden method

        System.out.println(c2.accelerate()); // Call a method of the super class

        System.out.println();

        System.out.println(Car.getNoCarsProduced() + " cars have been produced.");

        System.out.println();

        // Create a Truck object with one-arg constructor

        Truck t1 = new Truck("Ford Transit");

        System.out.println(t1.toString());
        System.out.println(t1.brake());
        System.out.println(t1.accelerate());

        System.out.println();

        // Truck Object (use the setters and getters methods)
        Truck t2 = new Truck();
        t2.setManufacturer("Hyundai Pick-Up");
        t2.setEngineSize(89.45f);
        t2.setRegistrationNo("99C5344");
        t2.setNCT(true);
        t2.setTrailer(false);

        System.out.println(t2.toString());
        System.out.println(t2.brake());
        System.out.println(t2.accelerate());

    }// main

}// class