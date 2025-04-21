package com.golovach_courses.lecture1;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] reversedArray = new int[array.length];

        System.out.println(Arrays.toString(array));
        ReverseArray obj = new ReverseArray();
        reversedArray = obj.reversedOutSideArray(array);
        System.out.println(Arrays.toString(reversedArray));

        array = obj.reversedInSideArray(array);
        System.out.println(Arrays.toString(array));

        boolean b = Arrays.equals(array, reversedArray);
        System.out.println(b);



    }

    int[] reversedInSideArray (int [] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    int[] reversedOutSideArray (int [] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - i - 1];
        }
        return reversedArray;
    }


}
