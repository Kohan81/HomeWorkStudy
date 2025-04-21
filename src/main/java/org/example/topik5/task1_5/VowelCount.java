package org.example.topik5.task1_5;

public class VowelCount {
    public String vowelCount(String message) {
        int aCount = 0;
        int eCount = 0;
        int iCount = 0;
        int oCount = 0;
        int uCount = 0;
        int totalVowels = 0;

        message = message.toLowerCase(); // Convert the message to lowercase for easier comparison

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            switch (ch) {
                case 'a':
                    aCount++;
                    break;
                case 'e':
                    eCount++;
                    break;
                case 'i':
                    iCount++;
                    break;
                case 'o':
                    oCount++;
                    break;
                case 'u':
                    uCount++;
                    break;
                default:
                    break;
            }
        }

        totalVowels = aCount + eCount + iCount + oCount + uCount;

        return "Total vowels: " + totalVowels + "\n" +
                "a: " + aCount + "\n" +
                "e: " + eCount + "\n" +
                "i: " + iCount + "\n" +
                "o: " + oCount + "\n" +
                "u: " + uCount;
    }
}