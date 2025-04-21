package org.example.topik5.task2_1;

public class Test {
    public static void main(String[] args) {

        IQ iq1 = new IQ("James Devine", 46, 87);
        IQ iq2 = new IQ("Helena Smith", 126, 101);
        IQ iq3 = new IQ("Daniel Jones", 27, 151);

        System.out.println(iq1.toString());
        iq1.IQReport();
        System.out.println();
        System.out.println(iq2.toString());
        iq2.IQReport();
        System.out.println();
        System.out.println(iq3.toString());
        iq3.IQReport();
    }
}
