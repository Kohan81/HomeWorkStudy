package org.stepic.level_2;

public class MySQRT {
    public static void main(String[] args) {

        System.out.println(sqrt(4));
        System.out.println(sqrt(-16));
    }

    public static double sqrt(double x) {
        if (x < 0){
            throw new  IllegalArgumentException("Expected non-negative number, got " + x );
        }
        return  Math.sqrt(x);
    }
}

/**
 * Реализуйте метод sqrt(), вычисляющий квадратный корень числа. В отличие от Math.sqrt(),
 * это метод при передаче отрицательного параметра должен бросать исключение java.lang.IllegalArgumentException
 * с сообщением "Expected non-negative number, got ?", где вместо вопросика будет подставлено
 * фактически переданное в метод число.
 */
