package com.manning.junitbook.parametrized;

public class WordCounter {

    public int countWords(String sentence) {
        return sentence.split(" ").length;
    }
}
