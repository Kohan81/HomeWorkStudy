package com.golovach_courses.lecture1;

import java.util.Arrays;

public class RecurseReverseArray {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9};
        RecurseReverseArray obj = new RecurseReverseArray();
        System.out.println(Arrays.toString(arr));
        arr = obj.reverseArray(arr, 0);
        System.out.println(Arrays.toString(arr));

    }

    int[] reverseArray(int[] arr, int index) {
        if (index == (arr.length - 1) / 2 ) {
            return arr;
        }
        int tmp = arr[index];
        arr[index] = arr[arr.length - 1 - index];
        arr[arr.length - 1 - index] = tmp;
        reverseArray(arr, index + 1);
        return arr;
    }
}
