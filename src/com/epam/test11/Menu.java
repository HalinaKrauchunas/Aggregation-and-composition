package com.epam.test11;

import java.util.*;

public class Menu {

    public static void printMenu() {

        System.out.println (
            "1 - Header.\n" +
                "2 - Add sentence in text.\n" +
                "3 - Print text.\n" +
                "4 - Close."
        );
    }

    public static int getNumberMenu()  {

        Scanner scanner = new Scanner (System.in);
        String inputString = scanner.nextLine ();
        try {
            return Integer.parseInt (inputString);
        } catch (NumberFormatException e) {
            System.out.println ("Error! You probably wanted to add a new sentence");
            return 2;
        }
    }
}
