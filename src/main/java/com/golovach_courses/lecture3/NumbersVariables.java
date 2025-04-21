package com.golovach_courses.lecture3;

import java.util.Arrays;

public class NumbersVariables {

    public static void main(String[] args) {

        char[] chars = {'1', '2', '3'};
        System.out.println(Arrays.toString(chars));
        NumbersVariables numbersVariables = new NumbersVariables();
        numbersVariables.variables(chars, 3);

    }

    void variables(char[] array, int var){

        if (var < 1) return;

        char[] chars = new char[var];

        for (int i = 0; i < var; i++){
            for (int ch = 0; ch < var; ch++){
                for (int v = 0; v < array.length; v++){
                    chars[ch] = array[i];
                }
            }
           for (int j = 0; j < array.length; j++){
               for (int ch = i; ch < var; ch++){
                   for (int v = 0; v < array.length; v++){
                       chars[ch] = array[j];
                   }
               }
               for (int k = 0; k < array.length; k++){
                   for (int ch = j; ch < var; ch++){
                       for (int v = 0; v < array.length; v++){
                           chars[ch] = array[k];
                       }
                   }
                   System.out.println(Arrays.toString(chars));

               }
           }
        }
    }
}
