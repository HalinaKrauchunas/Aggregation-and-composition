package com.epam.test11;

import java.util.*;
import java.util.regex.*;

public class Sentence {

    private String sentence;

    public Sentence(String sentence) {

        this.sentence = sentence;
    }

    @Override
    public String toString() {

        return "Sentence: " + sentence + "\n";
    }

    public void newSent(Scanner scanner) {
        while (!Pattern.compile ("[.!?]").matcher (this.sentence).find ()) {
            this.sentence += " " + Word.newWord (scanner);
        }
    }
}