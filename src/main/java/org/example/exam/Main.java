package org.example.exam;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String word;
        String extractedWord;

        int startExtractPosition;
        int endExtractPosition;

        System.out.print("Enter a word: ");

        word = scanner.nextLine();

        try{
            System.out.print("Enter a number from which to start the string extract: ");
            startExtractPosition = scanner.nextInt();

            System.out.print("Enter a number from which to end the string extract: ");
            endExtractPosition = scanner.nextInt();

            extractedWord = word.substring(startExtractPosition,endExtractPosition);
            System.out.println(extractedWord);

        } catch(Exception e){
            System.out.println("Enter a number!");
        }
    }
}