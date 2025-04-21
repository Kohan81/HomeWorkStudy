package org.stepic.level_1;

public class DoubleExpression {
    public static void main(String[] args) {

        System.out.println(doubleExpression(0.1, 0.2, 0.3));
        System.out.println(0x0bp3);
    }

    public static boolean doubleExpression(double a, double b, double c) {
//        return (a + b) - c <= 0.0001;
        return Math.abs((a + b) - c) < 0.0001;
    }
}
/**
 * Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
 * Допустимая погрешность – 0.0001 (1E-4)
 *
 * Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
 *
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 * Sample Input:
 *
 * 0.1 0.2 0.3
 * Sample Output:
 *
 * true
 */