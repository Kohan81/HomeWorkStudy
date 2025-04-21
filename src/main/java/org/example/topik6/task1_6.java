package org.example.topik6;

public class task1_6 {

    public static void main(String[] args) {

        String value = "two";

        int parsedValue = 0;

        try {
            parsedValue = Integer.parseInt("2");
            System.out.println(parsedValue);
            parsedValue = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.out.println("Error parsing number: " + value + " Program clothing  ");
        }
    }
}
