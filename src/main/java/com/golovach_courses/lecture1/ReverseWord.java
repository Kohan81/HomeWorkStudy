package com.golovach_courses.lecture1;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        System.out.println("please write any word: ");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        //word = word.toLowerCase();
        System.out.println("your word is: " + word);
        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length/2 - 1; i++) {
            char tmp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = tmp;
        }
        System.out.println(chars);
        System.out.println(word);

    }

}
//word = word.replaceAll("[^a-zA-Z]", ""); разберись что это?
