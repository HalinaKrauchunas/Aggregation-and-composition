package com.epam.test13;

import java.util.*;

public class Menu {

    public static void printMenu() {

        System.out.println (
            "1 - Add a new region in the state\n" +
                "2 - Add a new district in the region\n" +
                "3 - Add a new city in the district\n" +
                "4 - Print capital.\n" +
                "5 - Print number of region.\n" +
                "6 - Print region.\n" +
                "7 - Print state area.\n" +
                "8 - Print state.\n" +
                "9 - Close.\n"
        );
    }
    public static int getNumberMenu()  {

        Scanner scanner = new Scanner (System.in);
        String inputString = scanner.nextLine ();
        try {
            return Integer.parseInt (inputString);
        } catch (NumberFormatException e) {
            System.out.println ("Error! You probably wanted to add a new region");
            return 1;
        }
    }
}
