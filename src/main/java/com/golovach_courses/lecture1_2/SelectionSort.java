package com.golovach_courses.lecture1_2;

import java.util.Arrays;

public class SelectionSort {

    int [] array = {5, 8, 2, 4, 9, 3, 1, 0, 6, 7};

    public int[] selectionSort(int [] array) {

        for (int index = 0; index < array.length - 1; index++) {
            int minIndex = index;
            for (int barrier = index + 1; barrier < array.length; barrier++) {
                if (array[barrier] < array[minIndex]) {
                    minIndex = barrier;
                }
                int tmp = array[minIndex];
                array[minIndex] = array[index];
                array[index] = tmp;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        System.out.println(Arrays.toString(selectionSort.array));
        int[] sortedArray = selectionSort.selectionSort(selectionSort.array);
        System.out.println(Arrays.toString(selectionSort.array));

    }
}
