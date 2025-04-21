package org.example.topik5.task1_3;

public class Numbers {
    public static void main(String[] args) {

        Numbers n = new Numbers();

        System.out.println("Sun = " + n.sum(7, 8));
        System.out.println("Divide = " + n.divide(8, 8));
        System.out.println("Multiply = " + n.multiply(10, n.sum(7, 8)));
        System.out.println("Remainder = " + n.remainder(160, 15));
        n.message();
    }

    public int sum(int num1, int num2){
        return num1 + num2;
    }

    public float divide(float num1, float num2){
        return num1 / num2;
    }

    public float multiply(int num1, int num2){
        return num1 * num2;
    }

    public float remainder(float num1, float num2){
        return num1 % num2;
    }

    public void message(){
        System.out.println("This is a class that performs simple, mathematicaloperations");
    }
}
