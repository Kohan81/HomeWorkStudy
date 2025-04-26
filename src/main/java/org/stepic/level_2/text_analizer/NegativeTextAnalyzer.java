package org.stepic.level_2.text_analizer;

public class NegativeTextAnalyzer extends KeywordAnalyzer{

    private final String[] negativeTexts = {":(", "=(", ":|"};
    private final Label label = Label.NEGATIVE_TEXT;


    @Override
    protected String[] getKeywords() {
        return negativeTexts;
    }

    @Override
    protected Label getLabel() {
        return label;
    }

    @Override
    public Label processText(String text) {
        for (String negativeText : negativeTexts) {
            if (text.contains(negativeText)) {
                return label;
            }
        }
        return Label.OK;
    }
}
