package org.stepic.level_1;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

        int[] a = { 16, 17, 18, 19, 110 };
        int[] b = new int[0];
        int[] b1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(mergeArrays(a, b1)));
    }

    /**
     * Merges two given sorted arrays into one
     *
     * @param a1 first sorted array
     * @param a2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {
        if (a1.length == 0){
            return a2;
        } else if (a2.length == 0){
            return a1;
        }
        int[] result = new int[a1.length + a2.length];
        int i = 0, j = 0, k = 0;

        while (i < a1.length && j < a2.length) {
            if (a1[i] <= a2[j]) {
                result[k++] = a1[i++];
            } else {
                result[k++] = a2[j++];
            }
            if (i == a1.length) {
                while (j < a2.length) {
                    result[k++] = a2[j++];
                }
            } else if (j == a2.length) {
                while (i < a1.length) {
                    result[k++] = a1[i++];
                }
            }
        }

        return result; // your implementation here
    }
}

/**
 * Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же
 * порядке массив. Массивы могут быть любой длины, в том числе нулевой.
 *
 * Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность: он будет идти по двум
 * исходным массивам и сразу формировать отсортированный результирующий массив. Так, чтобы сортировка
 * полученного массива при помощи Arrays.sort() уже не требовалась. К сожалению, автоматически
 * это не проверить, так что это остается на вашей совести :)
 *
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода
 * добавит проверяющая система.
 *
 * Пример
 *
 * Если на вход подаются массивы {0, 2, 2} и {1, 3}, то на выходе должен получиться массив {0, 1, 2, 2, 3}
 */
