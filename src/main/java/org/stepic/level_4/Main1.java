package org.stepic.level_4;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main1 {

    public static void main(String[] args) throws IOException {
        InputStream stream;
        int result;
        stream = getStream( new byte[] { 0x33, 0x45, 0x01});

        result = checkSumOfStream(stream);
        System.out.print(result);
    }

    public static InputStream getStream(byte [] data)  {
        return new ByteArrayInputStream(data);
    }

    public static int checkSumOfStream(InputStream inputStream) throws IOException {
        int checksum = 0; // Начальная контрольная сумма для пустого набора данных
        int byteRead;

        // Читаем байты из потока до конца (-1 означает конец потока)
        while ((byteRead = inputStream.read()) != -1) {
            // Применяем формулу: C_{n+1} = rotateLeft(C_n) xor b_{n+1}
            checksum = Integer.rotateLeft(checksum, 1) ^ byteRead;
        }

        return checksum;
    }

}
