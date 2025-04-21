package org.stepic.level_1;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(factorial(1));
        System.out.println(factorial(3));
        System.out.println(factorial(0));
    }

    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {

        if (value < 0){
            throw new ArithmeticException();
        }
        if (value == 0){
            return BigInteger.ZERO;
        }
        BigInteger result = BigInteger.valueOf(1);

        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;// your implementation here
//        return  value == 0 ? BigInteger.ONE : BigInteger.valueOf(value).multiply(factorial (value-1));
    }
}

/**
 * Реализуйте метод, вычисляющий факториал заданного натурального числа.
 *
 * Факториал N вычисляется как 1*2...*N
 *
 * Поскольку это очень быстро растущая функция, то даже для небольших N
 * N вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.
 *
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
 *
 * Sample Input 1:
 *
 * 1
 * Sample Output 1:
 *
 * 1
 * Sample Input 2:
 *
 * 3
 * Sample Output 2:
 *
 * 6
 */
