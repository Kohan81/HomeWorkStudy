package org.stepic.level_1;

public class StringExpression {
    public static void main(String[] args) {

        System.out.println('A' + '1' + "2");
        System.out.println("A" + ('\t' + '\u0003'));
        System.out.println("A" + 12);
        System.out.println('A' + "12");
    }
}

/**
 *
 * Выберите выражения, которые дадут в качестве результата строку A12.
 * 'A' + '1' + "2"
 *
 * "A" + ('\t' + '\u0003')
 *
 * "A" + 12
 *
 * 'A' + "12"
 */
