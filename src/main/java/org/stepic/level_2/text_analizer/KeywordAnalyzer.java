package org.stepic.level_2.text_analizer;

public abstract class KeywordAnalyzer implements TextAnalyzer {

    protected abstract String[] getKeywords(); //будет возвращать набор ключевых слов,

    protected abstract Label getLabel(); //будет возвращать метку, которой необходимо пометить положительные срабатывания

    @Override
    public Label processText(String text){
        return getLabel();
    };
}
