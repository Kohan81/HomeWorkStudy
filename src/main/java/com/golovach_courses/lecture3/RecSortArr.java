package com.golovach_courses.lecture3;

import java.util.Arrays;

public class RecSortArr {
    public static void main(String[] args) {

        int [] array = {4, 9, 3, 1, 8, 0, 2, 6, 7, 5};
        System.out.println(Arrays.toString(array));
        RecSortArr sortArr = new RecSortArr();
        sortArr.recSort(array, 0);
        System.out.println(Arrays.toString(array));
    }

    void recSort(int[] arr, int index) {

        if (index >= arr.length-1) return;
        int min = arr[index];
        for (int i = arr.length-1; i > 0 + index; i--) {
            if (min > arr[i]) {
                arr[index] = arr[i];
                arr[i] = min;
                min = arr[index];
            }
        }

        recSort(arr, index + 1);
    }
}
