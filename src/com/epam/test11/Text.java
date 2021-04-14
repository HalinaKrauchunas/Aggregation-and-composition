package com.epam.test11;

import java.util.*;

public class Text {

    private String sentences, header;

    public Text(String sentences) {

        this.sentences = sentences;
    }

    @Override
    public String toString() {

        return "Header: " + header +
            "Text:\n" + sentences;
    }

    public void addSent(Scanner scanner) {
        Sentence sentence = new Sentence ("");
        sentence.newSent (scanner);
        this.sentences += " " + sentence;
    }

    public void addHeader(Scanner scanner) {
        System.out.print ("Header: ");
        this.header = scanner.nextLine () + "\n";
    }

    public void printText(){

        System.out.println (toString ());
    }
}
