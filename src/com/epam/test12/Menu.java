package com.epam.test12;

import java.util.*;

public class Menu {
    public static void printMenu() {

        System.out.println (
            "1 - Drive.\n" +
                "2 - Refuel.\n" +
                "3 - Turn on the engine.\n" +
                "4 - New wheel.\n"+
                "5 - Current number of wheels.\n"+
                "6 - Current amount of fuel.\n" +
                "7 - Enter car model.\n" +
                "8 - Print car model.\n"+
                "9 - Close.\n"
        );
    }
    public static int getNumberMenu()  {

        Scanner scanner = new Scanner (System.in);
        String inputString = scanner.nextLine ();
        try {
            return Integer.parseInt (inputString);
        } catch (NumberFormatException e) {
            System.out.println ("Error! You probably wanted go");
            return 1;
        }
    }
}
