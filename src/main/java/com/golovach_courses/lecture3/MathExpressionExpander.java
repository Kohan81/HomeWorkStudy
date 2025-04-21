package com.golovach_courses.lecture3;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MathExpressionExpander {
    private static int stepCounter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите математическое выражение:");
        String input = scanner.nextLine();
        scanner.close();

        try {
            String expandedExpression = expandExpression(input);
            System.out.println("Ответ: " + evaluateExpression(expandedExpression));
        } catch (Exception e) {
            System.out.println("Ошибка обработки выражения: " + e.getMessage());
        }
    }

    public static String expandExpression(String expression) {
        expression = expression.replace(" ", ""); // Убираем пробелы
        expression = expression.replace("(-", "(0-"); // Обработка унарного минуса

        System.out.println(stepCounter++ + ") Убрали пробелы и обработали унарный минус: " + expression);

        while (expression.contains("(")) {
            expression = distribute(expression);
            System.out.println(stepCounter++ + ") Раскрыли скобки: " + expression);
        }

        return simplifyExpression(expression);
    }

    private static String distribute(String expression) {
        // Простая замена для раскрытия простых скобок
        Pattern pattern = Pattern.compile("\\(([^()]+)\\)");
        Matcher matcher = pattern.matcher(expression);
        while (matcher.find()) {
            String insideBrackets = matcher.group(1);
            expression = expression.replace("(" + insideBrackets + ")", insideBrackets);
        }
        return expression;
    }

    private static String simplifyExpression(String expression) {
        // Упрощение выражения, например, объединение одинаковых членов
        System.out.println(stepCounter++ + ") Упрощенное выражение: " + expression);
        return expression;
    }

    private static double evaluateExpression(String expression) {
        // Примитивный вычислитель (не учитывает приоритет операций)
        String[] tokens = expression.split("(?=[-+*/])|(?<=[-+*/])");
        Stack<Double> values = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (String token : tokens) {
            token = token.trim();
            if (token.isEmpty()) continue;

            if (token.matches("[-+*/]") && !values.isEmpty()) {
                ops.push(token.charAt(0));
            } else {
                values.push(Double.parseDouble(token));
            }
        }

        while (!ops.isEmpty()) {
            double b = values.pop();
            double a = values.pop();
            char op = ops.pop();
            double result = applyOp(a, b, op);
            System.out.println(stepCounter++ + ") " + a + " " + op + " " + b + " = " + result);
            values.push(result);
        }
        return values.pop();
    }

    private static double applyOp(double a, double b, char op) {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };
    }
}