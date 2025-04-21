package org.example.topik5.task1_8;

public class Test {

    public static void main(String[] args) {

        Smartphone smartphone1 = new Smartphone("Nooks 610", "Nooks", 100.00f,
                "04/06/2008", 0.00f, false);
        Smartphone.numberOfphone++;

        Smartphone smartphone2 = new Smartphone("H3C Sensation 610", "H3C", 110.00f,
                "14/07/2012", 0.00f, false);
        Smartphone.numberOfphone++;

        Smartphone smartphone3 = new Smartphone("Sinsung Desire", "Sinsung", 190.00f,
                "14/07/2015", 0.00f, false);
        Smartphone.numberOfphone++;

        smartphone1.topUpCredit(15);
        smartphone1.charge();
        System.out.println();

        System.out.println(smartphone1.toString());
        System.out.println(smartphone2.toString());
        System.out.println(smartphone3.toString());

        System.out.println(Smartphone.numberOfphone + " smartphones have been created");
        System.out.println("The average price of smartphones is: " +
                (smartphone1.price + smartphone2.price + smartphone3.price)/Smartphone.numberOfphone);
    }
}
