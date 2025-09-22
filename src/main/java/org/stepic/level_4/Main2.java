package org.stepic.level_4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main2 {

    public static void main(String[] args) throws IOException {

        {
            byte[] data = {65,13,10,13, 13,10, 10, 13};
            ByteArrayInputStream inputStream = new ByteArrayInputStream(data);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(16);
            changeDelimiter(inputStream, outputStream); // здесь ваша функция
            byte [] out = outputStream.toByteArray();
            for (byte b : out){
                System.out.println(b);
        }
    }
}

    private static void changeDelimiter(ByteArrayInputStream inputStream, ByteArrayOutputStream outputStream) throws IOException {

        int currentByte;
        int previousByte = -1;

        while ((currentByte = inputStream.read()) != -1) {
            if (previousByte == 13 && currentByte == 10) {
                // Нашли последовательность \r\n - заменяем на \n
                System.out.println(10);
                previousByte = -1; // Сбрасываем предыдущий байт
            } else {
                if (previousByte != -1) {
                    // Выводим предыдущий байт, если он есть
                    System.out.println(previousByte);
                }
                previousByte = currentByte;
            }
        }

        // Выводим последний байт, если он остался
        if (previousByte != -1) {
            System.out.println(previousByte);
        }

        // Обязательно вызываем flush() для гарантированного вывода
        System.out.flush();
    }
}
