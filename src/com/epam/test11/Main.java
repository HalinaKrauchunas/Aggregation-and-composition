package com.epam.test11;

import java.util.*;

import static com.epam.test11.Menu.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        Text text = new Text ("");
        int close = 0;
        while (close != 4) {
            printMenu ();
            int choice = getNumberMenu ();
            switch (choice) {
                case 1 -> text.addHeader (scanner);
                case 2 -> text.addSent (scanner);
                case 3 -> text.printText ();
                case 4 -> close = 4 ;
            }
        }
    }
}