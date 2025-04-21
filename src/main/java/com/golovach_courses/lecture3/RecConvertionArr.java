package com.golovach_courses.lecture3;

import java.util.Arrays;

public class RecConvertionArr {

    public static void main(String[] args) {

        int [] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        RecConvertionArr rec = new RecConvertionArr();
        System.out.println(Arrays.toString(array));
        rec.recConvArr(array, 0);
        System.out.println(Arrays.toString(array));
    }

    void recConvArr(int[] arr, int index){

        if(index > arr.length / 2){
            return;
        }
        int temp = arr[index];
        arr[index] = arr[arr.length - 1 - index];
        arr[arr.length - 1 - index] = temp;

        recConvArr(arr, index + 1);
    }
}
