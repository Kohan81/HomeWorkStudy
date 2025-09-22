package org.stepic.level_4;

import java.io.*;
import java.nio.charset.Charset;

public class ReadNumbers {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Charset charset = Charset.forName("US-ASCII");

        char c;
        String s = "";

        System.out.println("input your numbers: ");
        do {
            c = (char) br.read();
            s += String.valueOf(c);
            int b = Character.getNumericValue(c);

            System.out.println(b);

        } while (c != '\n');
        System.out.println("ther is your answer: " + s);

    }

//    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
//
//    }

}
/**
 * Реализуйте метод, который зачитает данные из InputStream и преобразует их в строку, используя заданную кодировку.
 *
 * Пример
 * InputStream последовательно возвращает четыре байта: 48 49 50 51.
 *
 * Метод, вызванный для такого InputStream и кодировки ASCII, должен вернуть строку "0123".
 */