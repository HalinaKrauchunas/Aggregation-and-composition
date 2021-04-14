package com.epam.test11;

import java.util.*;

public class Word {

    private String word;

    public static Word newWord(Scanner scanner) {

        Word word = new Word ();
        System.out.print ("Word: ");
        word.word = scanner.nextLine ();
        return word;
    }

    @Override
    public String toString() {

        return "word(" + word + ")";
    }
}