package com.golovach_courses.lecture1_2;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {3, 6, 1, 9, 8, 7, 4, 2, 5};

        System.out.println(Arrays.toString(array));

        BubbleSort bubbleSort = new BubbleSort();

        int[] sortedArray = new int[array.length];

              sortedArray = bubbleSort.normalBubbleSort(array);

        System.out.println(Arrays.toString(sortedArray));

        sortedArray = bubbleSort.bubbleSort_v2(array);

        System.out.println(Arrays.toString(sortedArray));
    }

    int[] normalBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    int[] bubbleSort_v2(int[] arr) {
        for (int border = 0; border > arr.length - 1 ; border++) {
            for (int index = arr.length - 1 - border; index > 0 ; index--) {
                if (arr[index] > arr[index - 1]) {
                    int temp = arr[index];
                    arr[index] = arr[index - 1];
                    arr[index + 1] = temp;
                }
            }
        }
        return arr;
    }
}
