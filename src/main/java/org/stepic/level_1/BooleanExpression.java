package org.stepic.level_1;

public class BooleanExpression {
    public static void main(String[] args) {

        System.out.println(booleanExpression(false, false, false, false));
        System.out.println(booleanExpression(true, true, true, true));
        System.out.println(booleanExpression(true, true, false, false));
        System.out.println(booleanExpression(true, false, true, false));
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        boolean [] array = new boolean[] {a, b, c, d};
        int counter = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i]){
                counter++;
            }
        }
        if(counter == 2){
            return true;
        }
        return false;
    }

}

/**
 * Реализуйте метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые).
 * Во всех остальных случаях метод должен возвращать false.
 *
 * Воспользуйтесь шаблоном кода, который предлагает система. Ввод-вывод будет сделан за вас.
 * Вам надо только проанализировать переданные в метод booleanExpression значения (a, b, c, d) и вернуть результат.
 * Попробуйте составить формулу с использованием булевых операторов.
 * Если не получается, вернитесь к этому заданию после просмотра степов про условные операторы и циклы.
 *
 * При записи сложных выражений рекомендуется использовать скобки, чтобы не запутаться в порядке применения операторов.
 *
 * В качестве примера уже указано заведомо некорректное решение задачи. Исправьте его.
 *
 * Совет тем, у кого не проходит какой-то из тестов. В данной задаче возможно всего 16 комбинаций значений входных параметров.
 * Их можно выписать на бумажку, посчитать для них правильные ответы и сравнить с тем, что выдает ваше решение.
 * Попробуйте самостоятельно проделать это, найти ошибку и исправить решение.
 * Sample Input 1:
 *
 * false false false false
 * Sample Output 1:
 *
 * false
 * Sample Input 2:
 *
 * true true true true
 * Sample Output 2:
 *
 * false
 * Sample Input 3:
 *
 * false false true true
 * Sample Output 3:
 *
 * true
 */