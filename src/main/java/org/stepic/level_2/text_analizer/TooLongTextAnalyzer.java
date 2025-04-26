package org.stepic.level_2.text_analizer;

public class TooLongTextAnalyzer implements TextAnalyzer{

    private final int maxLength;

    public TooLongTextAnalyzer(int maxLength){
        this.maxLength = maxLength;
    }

    TooLongTextAnalyzer(){
        maxLength = 100;
    }
    @Override
    public Label processText(String text) {
        if (maxLength < text.length()){
            return Label.TOO_LONG;
        }
        return Label.OK;
        //return maxLength > text.length() ? Label.OK : Label.TOO_LONG;
    }
}
