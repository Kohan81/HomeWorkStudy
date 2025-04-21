package org.example.topik6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task1_8 {

    public static void main(String[] args) {

        String [] country = {"Cork", "Athlone", "Limerick", "Sligo", "Dublin"};

        for(int i = 0; i<country.length; i++){
            System.out.println(i+1 + " " + country[i]);
        }

        System.out.println("Enter a number to make your selection: ");

        int num = 0;

        while(num < 1 || num > country.length){
            try {
                Scanner sc = new Scanner(System.in);
                num = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number, NOT WORDS! Please make your selection: ");
            }
            if(num < 1 || num > 5){
                System.out.println(" A number must be between 1 and 5");
            } else {
                System.out.println(" Your selection is: " + country[num-1]);
            }
        }


    }
}
