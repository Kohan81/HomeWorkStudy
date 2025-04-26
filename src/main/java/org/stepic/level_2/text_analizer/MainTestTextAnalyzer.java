package org.stepic.level_2.text_analizer;

import java.util.Locale;

public class MainTestTextAnalyzer {
    public static void main(String[] args) {

        String text_OK = "This is a test";
        String text_SPAM = "this is first test, and it is spam";
        String text_NegativeText = "This is a test";
        String text_TooLongText = " Это весело";

        String [] spam = {"first", "second"};

        TextAnalyzer spamAnalyzer = new SpamAnalyzer(spam);
        TextAnalyzer tooLongAnalyzer = new TooLongTextAnalyzer(10);
        TextAnalyzer negativeAnalyzer = new NegativeTextAnalyzer();

        TextAnalyzer[] arrayTextsAnalyzers = {spamAnalyzer, tooLongAnalyzer, negativeAnalyzer};

        MainTestTextAnalyzer mainTestTextAnalyzer = new MainTestTextAnalyzer();
        System.out.println(mainTestTextAnalyzer.checkLabels(arrayTextsAnalyzers, text_TooLongText));
    }

    // тесты
//    public static void main(String[] args) {
//        // инициализация анализаторов для проверки в порядке данного набора анализаторов
//        String[] spamKeywords = {"spam", "bad"};
//        int commentMaxLength = 40;
//        TextAnalyzer[] textAnalyzers1 = {
//                new SpamAnalyzer(spamKeywords),
//                new NegativeTextAnalyzer(),
//                new TooLongTextAnalyzer(commentMaxLength)
//        };
//        TextAnalyzer[] textAnalyzers2 = {
//                new SpamAnalyzer(spamKeywords),
//                new TooLongTextAnalyzer(commentMaxLength),
//                new NegativeTextAnalyzer()
//        };
//        TextAnalyzer[] textAnalyzers3 = {
//                new TooLongTextAnalyzer(commentMaxLength),
//                new SpamAnalyzer(spamKeywords),
//                new NegativeTextAnalyzer()
//        };
//        TextAnalyzer[] textAnalyzers4 = {
//                new TooLongTextAnalyzer(commentMaxLength),
//                new NegativeTextAnalyzer(),
//                new SpamAnalyzer(spamKeywords)
//        };
//        TextAnalyzer[] textAnalyzers5 = {
//                new NegativeTextAnalyzer(),
//                new SpamAnalyzer(spamKeywords),
//                new TooLongTextAnalyzer(commentMaxLength)
//        };
//        TextAnalyzer[] textAnalyzers6 = {
//                new NegativeTextAnalyzer(),
//                new TooLongTextAnalyzer(commentMaxLength),
//                new SpamAnalyzer(spamKeywords)
//        };
//        // тестовые комментарии
//        String[] tests = new String[8];
//        tests[0] = "This comment is so good.";                            // OK
//        tests[1] = "This comment is so Loooooooooooooooooooooooooooong."; // TOO_LONG
//        tests[2] = "Very negative comment !!!!=(!!!!;";                   // NEGATIVE_TEXT
//        tests[3] = "Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :|;";    // NEGATIVE_TEXT or TOO_LONG
//        tests[4] = "This comment is so bad....";                          // SPAM
//        tests[5] = "The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!";  // SPAM or TOO_LONG
//        tests[6] = "Negative bad :( spam.";                               // SPAM or NEGATIVE_TEXT
//        tests[7] = "Very bad, very neg =(, very ..................";      // SPAM or NEGATIVE_TEXT or TOO_LONG
//        TextAnalyzer[][] textAnalyzers = {textAnalyzers1, textAnalyzers2, textAnalyzers3,
//                textAnalyzers4, textAnalyzers5, textAnalyzers6};
//        MainTestTextAnalyzer testObject = new MainTestTextAnalyzer();
//        int numberOfAnalyzer; // номер анализатора, указанный в идентификаторе textAnalyzers{№}
//        int numberOfTest = 0; // номер теста, который соответствует индексу тестовых комментариев
//        for (String test : tests) {
//            numberOfAnalyzer = 1;
//            System.out.print("test #" + numberOfTest + ": ");
//            System.out.println(test);
//            for (TextAnalyzer[] analyzers : textAnalyzers) {
//                System.out.print(numberOfAnalyzer + ": ");
//                System.out.println(testObject.checkLabels(analyzers, test));
//                numberOfAnalyzer++;
//            }
//            numberOfTest++;
//        }
//    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            if (analyzer.processText(text) == Label.SPAM){
                return Label.SPAM;
            }
            if (analyzer.processText(text) == Label.NEGATIVE_TEXT){
                return Label.NEGATIVE_TEXT;
            }
            if (analyzer.processText(text) == Label.TOO_LONG){
                return Label.TOO_LONG;
            }
        }
        return Label.OK;
    }
}
