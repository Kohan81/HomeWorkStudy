package org.example.topik5.task2_6.answer;

public class Main {
    public static void main(String[] args){
        Vegetable[] veggies = new Vegetable[3];
        veggies[0] = new Carrot("Carrot","Apiaceae");
        veggies[1] = new Pea("Pea","Legumes");
        veggies[2] = new Corn("Corn","Gramineae");

        for(Vegetable v:veggies){
            System.out.println(v);
            System.out.println("To cook: " + v.cook());
            System.out.println();
        }
    }
}