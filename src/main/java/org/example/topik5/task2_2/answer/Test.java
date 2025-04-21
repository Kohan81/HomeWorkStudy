package org.example.topik5.task2_2.answer;

public class Test {

    public static void main(String[] args) {
        // Create an object of class type TV
        Television tv1 = new Television();

        // Set the state of the TV object
        tv1.setOn_Off(true);
        tv1.setChannel(100);
        tv1.setVolume(5);

        // Set channel to next channel up.
        tv1.channelUp();

        // Set channel to next channel down.
        tv1.channelDown();

        // Turn sound up one unit
        tv1.volumeUp();

        // Turn sound up one unit
        tv1.volumeUp();

        // Turn volume down one unit
        tv1.volumeDown();

        // Turn TV off
        tv1.setOn_Off(false);

        // Call toString()
        System.out.println(tv1.toString());

    }// main

}// class