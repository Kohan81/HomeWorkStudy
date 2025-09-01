package org.stepic.level_2.text_analizer;

public class Test {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace.length < 3) {
            return null;
        }
        StackTraceElement caller = stackTrace[2];
        return caller.getClassName() + "#" + caller.getMethodName();
    }

// этот метод не подошел, тк возвращает " Wrong answer"

//    public static String getCallerClassAndMethodName() {
//        String callerClassAndMethodName = null;
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement stackTraceElement : stackTraceElements) {
//            String className = stackTraceElement.getClassName();
//            String methodName = stackTraceElement.getMethodName();
//            int lineNumber = stackTraceElement.getLineNumber();
//            callerClassAndMethodName = className + "#" + methodName;
//
//        }
//        return callerClassAndMethodName;
//    }
}
/**
Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.

        Метод getCallerClassAndMethodName() должен возвращать имя класса и метода, откуда вызван метод,
 вызвавший данный утилитный метод. Или null (нулевую ссылку, а не строку "null"), если метод,
 вызвавший getCallerClassAndMethodName() является точкой входа в программу, т.е. его никто не вызывал.

        Это актуально, например, в библиотеках логирования, где для каждого сообщения в логе надо
 выводить класс и метод, откуда сообщение было залогировано.

 При запуске эта программа должна вывести:

 null
 org.stepic.java.example.Test#main

 P.S. При тестировании этой программы в среде разработки вы можете получить другой результат:
 вместо null в первой строчке будет напечатан какой-то посторонний класс и метод.
 Это связано с тем, что среда разработки обычно запускает не ваш класс, а свой собственный,
 который затем уже вызывает ваш. Чтобы этого избежать, запускайте программу командой "java" в командной строке.

 P.P.S. Эта задача в уроке про исключения не случайно :)

**/