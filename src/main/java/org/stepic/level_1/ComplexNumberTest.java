package org.stepic.level_1;

import java.util.Objects;

public class ComplexNumberTest {
    public static void main(String[] args) {

        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        System.out.println( a.equals(b)); // return true

        int aAsInt = a.hashCode();
        int bAsInt = b.hashCode();

        System.out.println(aAsInt == bAsInt );
        System.out.println(aAsInt);
        System.out.println(bAsInt);
//        System.out.println(a.hashCode());// must be equal to b.hashCode()
    }
}

 final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         ComplexNumber that = (ComplexNumber) o;
         return Double.compare(re, that.re) == 0 && Double.compare(im, that.im) == 0;
     }

     @Override
     public int hashCode() {
         return Objects.hash(re, im);
     }
 }
 /**
  *Дан класс ComplexNumber. Переопределите в нем методы equals() и hashCode() так, чтобы equals()
  * сравнивал экземпляры ComplexNumber по содержимому полей re и im, а hashCode()
  * был бы согласованным с реализацией equals().
  *
  * Реализация hashCode(), возвращающая константу или не учитывающая дробную часть re и im, засчитана не будет
  *
  * Пример
  *
  * ComplexNumber a = new ComplexNumber(1, 1);
  * ComplexNumber b = new ComplexNumber(1, 1);
  * // a.equals(b) must return true
  * // a.hashCode() must be equal to b.hashCode()
  *
  * Подсказка 1. Поищите в классе java.lang.Double статический метод, который поможет в решении задачи.
  * Подсказка 2. Если задача никак не решается, можно позвать на помощь среду разработки,
  * которая умеет сама генерировать equals() и hashCode(). Если вы воспользовались помощью IDE,
  * то разберитесь, что было сгенерировано и почему оно выглядит именно так.
  * Когда вас на собеседовании попросят на бумажке реализовать equals() и hashCode()
  * для какого-нибудь простого класса, то среда разработки помочь не сможет.
  */