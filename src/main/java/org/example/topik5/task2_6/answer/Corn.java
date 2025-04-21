package org.example.topik5.task2_6.answer;


public class Corn extends Vegetable{
public Corn(String name, String family){
    super(name,family);
}

@Override
public String cook(){
    return super.cook() + "\nAdd in butter and salt..";
}
}