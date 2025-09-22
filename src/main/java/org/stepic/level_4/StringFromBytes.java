package org.stepic.level_4;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringFromBytes {
    public static void main(String[] args) throws IOException {

        byte [] bytes = new byte[4];
        for (int i = 0; i < 4; i++) {
            bytes[i] = (byte) ((byte) i + 48);
        }

        InputStream inputStream = new ByteArrayInputStream(bytes);
        System.out.println(readAsString(inputStream, StandardCharsets.US_ASCII));

    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        try (InputStreamReader reader = new InputStreamReader(inputStream, charset)) {
            StringBuilder result = new StringBuilder();
            char[] buffer = new char[1024];
            int length;

            while ((length = reader.read(buffer)) != -1) {
                result.append(buffer, 0, length);
            }

            return result.toString();
        }
    }
}
/**
 * Реализуйте метод, который зачитает данные из InputStream и преобразует их в строку, используя заданную кодировку.
 *
 * Пример
 *
 * InputStream последовательно возвращает четыре байта: 48 49 50 51.
 *
 * Метод, вызванный для такого InputStream и кодировки ASCII, должен вернуть строку "0123".
 */
