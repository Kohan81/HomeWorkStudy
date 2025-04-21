package org.example.topik5.task2_5.answer;

import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Orange o = new Orange("Orange","orange","Spain");
        Banana b = new Banana("Banana","yellow","Ecuador");
        Fruit f = new Fruit("Fruit","red","Apple"); //ha ha ha

        List<Fruit> fruits = new ArrayList<Fruit>();
        fruits.add(o);
        fruits.add(b);
        fruits.add(f);

        for(Fruit fruit:fruits){
            System.out.println(fruit);
            System.out.println(fruit.peel()+"\n");
        }
    }
}