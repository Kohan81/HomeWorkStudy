package com.golovach_courses.lecture3;
import java.util.ArrayList;
import java.util.List;

public class CombinationGenerator {
    public static void main(String[] args) {
        char[] symbols = {'1', '2', '3', '4', '5'}; // Массив символов
        int cellCount = 5; // Количество ячеек

        List<String> combinations = generateCombinations(symbols, cellCount);

        // Вывод результатов
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }

    public static List<String> generateCombinations(char[] symbols, int cellCount) {
        List<String> results = new ArrayList<>();
        generateCombinationsRecursive("", symbols, cellCount, results);
        return results;
    }

    private static void generateCombinationsRecursive(String prefix, char[] symbols, int cellCount, List<String> results) {
        if (prefix.length() == cellCount) {
            results.add(prefix);
            return;
        }

        for (char symbol : symbols) {
            generateCombinationsRecursive(prefix + symbol, symbols, cellCount, results);
        }
    }
}
