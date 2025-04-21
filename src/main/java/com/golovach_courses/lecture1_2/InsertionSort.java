package com.golovach_courses.lecture1_2;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int [] arr = { 4, 0, 5, 3, 6, 2, 7, 8, 9, 1 };
        int[] arr2 = { 4, 0, 5, 3, 6, 2, 7, 8, 9, 1 };

        InsertionSort obj = new InsertionSort();
        System.out.println(Arrays.toString(arr));
        obj.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        obj.insertionSort2(arr2);
        System.out.println(Arrays.toString(arr2));


    }

    void insertionSort(int [] arr) {

        for (int index_barrier = 1; index_barrier < arr.length; index_barrier++) {
            int temp = arr[index_barrier];
            int index_sorted = index_barrier - 1;
            while (index_sorted >= 0 && arr[index_sorted] > temp) {
                arr[index_sorted + 1] = arr[index_sorted];
                index_sorted = index_sorted - 1;
            }
            arr[index_sorted + 1] = temp;
        }
    }

    void insertionSort2(int [] arr) {
        for (int border_index = 1; border_index < arr.length; border_index++) {
            int temp = arr[border_index];
            //int index_sorted = border_index - 1;
            int position = Arrays.binarySearch(arr, 0,border_index, temp);
            if (position >= 0) {
                System.arraycopy(arr, position, arr, position + 1, border_index - position);
            } else {
                position = (position * -1) - 1;
                System.arraycopy(arr, position, arr, position + 1, border_index - position);
                arr[position] = temp;
            }
        }
    }

}

