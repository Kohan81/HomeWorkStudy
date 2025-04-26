package org.stepic.level_2.text_analizer;

public class SpamAnalyzer extends KeywordAnalyzer{

    private final String [] keywords;
    private final Label label;

    SpamAnalyzer(String [] words){
        keywords = words;
        label = Label.SPAM;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return label;
    }

    @Override
    public Label processText(String text) {
        for (String word : keywords) {
            if (text.contains(word)) {
                return label;
            }
        }
        return Label.OK;
    }
}
