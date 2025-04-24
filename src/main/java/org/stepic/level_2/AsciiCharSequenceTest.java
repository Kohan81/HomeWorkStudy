package org.stepic.level_2;

class AsciiCharSequence implements java.lang.CharSequence{

    private final byte[] data;

    public AsciiCharSequence(byte[] data) {
        // Защита от изменения массива снаружи
        this.data = java.util.Arrays.copyOf(data, data.length);
    }

    @Override
    public int length() {
        return data.length;
    }

    @Override
    public char charAt(int index) {
        return (char) (data[index] & 0xFF); // Преобразуем byte в char
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] sub = new byte[end - start];
        System.arraycopy(data, start, sub, 0, end - start);
        return new AsciiCharSequence(sub);
    }

    @Override
    public String toString() {
        // Конструируем строку из байтов через правильную кодировку
        return new String(data);
    }
}
public class AsciiCharSequenceTest{
    public static void main(String[] args) {

        String s = "Hello World";
        byte[] bytes = s.getBytes();
        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(bytes);
        System.out.println(asciiCharSequence.charAt(2));
        System.out.println(asciiCharSequence.subSequence(5, 8));
        System.out.println(asciiCharSequence.length());
        System.out.println(asciiCharSequence.toString());
    }
}

/**
 * Напишите класс AsciiCharSequence, реализующий компактное хранение последовательности ASCII-символов
 * (их коды влезают в один байт) в массиве байт. По сравнению с классом String, хранящим каждый символ как char,
 * AsciiCharSequence будет занимать в два раза меньше памяти.
 *
 * Класс AsciiCharSequence должен:
 *
 * реализовывать интерфейс java.lang.CharSequence;
 * иметь конструктор, принимающий массив байт;
 * определять методы length(), charAt(), subSequence() и toString()
 * Сигнатуры методов и ожидания по их поведению смотрите в описании интерфейса java.lang.CharSequence
 * (JavaDoc или исходники).
 *
 * В данном задании методам charAt() и subSequence() всегда будут подаваться корректные входные параметры,
 * поэтому их проверкой и обработкой ошибок заниматься не нужно. Тем более мы еще не проходили исключения.
 *
 * P.S. В Java 9 ожидается подобная оптимизация в самом классе String: http://openjdk.java.net/jeps/254
 */