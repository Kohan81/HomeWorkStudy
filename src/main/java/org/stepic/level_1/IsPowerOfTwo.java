package org.stepic.level_1;

public class IsPowerOfTwo {
    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(2));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(-2));

        int[] testValues = {1, 2, 3, 4, 16, 18, -8, -10, 0};

        System.out.println("Testing methods for checking if absolute value is a power of two:");
        for (int n : testValues) {
            System.out.printf("n = %4d: Integer.method = %-5b, Bitwise.trick = %-5b, Brute.force = %-5b\n",
                    n,
                    isPowerOfTwoUsingInteger(n),
                    isPowerOfTwoBitwise(n),
                    isPowerOfTwoBruteForce(n)
            );
        }
    }

    /**
     * Checks if given <code>value</code> is a power of two.
     *
     * @param value any number
     * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
     */
    public static boolean isPowerOfTwo(int value) {

        int abs = Math.abs(value);
        // 0 не является степенью двойки
        if (abs == 0) return false;
        // Используем побитовый трюк: степень двойки имеет только один бит в 1
        return (abs & (abs - 1)) == 0;// you implementation here
    }

    /**
     * 1. Используем статический метод из java.lang.Integer:
     *    Integer.bitCount(x) возвращает количество единиц в двоичном представлении x.
     *    Для степеней двойки оно равно 1.
     */
    public static boolean isPowerOfTwoUsingInteger(int n) {
        int abs = Math.abs(n);
        // 0 не является степенью двойки
        if (abs == 0) return false;
        return Integer.bitCount(abs) == 1;
    }

    /**
     * 2. Применяем трюк с побитовыми операциями:
     *    x & (x - 1) == 0 только для степеней двойки (и x > 0).
     */
    public static boolean isPowerOfTwoBitwise(int n) {
        int abs = Math.abs(n);
        if (abs == 0) return false;
        return (abs & (abs - 1)) == 0;
    }

    /**
     * 3. Решение "в лоб" с циклом: проверяем, делится ли abs на 2 до тех пор,
     *    пока не дойдём до 1 или не найдём остаток.
     */
    public static boolean isPowerOfTwoBruteForce(int n) {
        int abs = Math.abs(n);
        if (abs == 0) return false;
        while (abs > 1) {
            // если не делится на 2, сразу false
            if (abs % 2 != 0) return false;
            abs /= 2;
        }
        return true;
    }
}

/**
 * Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
 *
 * Решать можно разными способами:
 *
 * воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
 * применив пару трюков из двоичной арифметики;
 * написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после просмотра соответствующих уроков).
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
 *
 * Sample Input 1:
 *
 * 0
 * Sample Output 1:
 *
 * false
 * Sample Input 2:
 *
 * 1
 * Sample Output 2:
 *
 * true
 * Sample Input 3:
 *
 * -2
 * Sample Output 3:
 *
 * true
 */