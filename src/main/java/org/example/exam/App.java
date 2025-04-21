package org.example.exam;

import java.util.Scanner;
public class App {
    public static void main(String[] args){
        App q = new App();
        q.methodA();
    }
    public void methodA(){
        methodB();
    }
    public void methodB(){
        Scanner scanner = new Scanner(System.in);
        int userAge = 0;
        System.out.print("Enter your age: ");
        userAge = scanner.nextInt();
        System.out.println("Your age is: " + userAge);
    }
}