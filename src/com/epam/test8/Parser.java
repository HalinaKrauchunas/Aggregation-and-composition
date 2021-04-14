package com.epam.test8;

import java.util.*;

public class Parser {

    public static long getLong() throws Exception {
        Scanner scanner = new Scanner (System.in);
        String inputString = scanner.nextLine ();
        try {
            if (Long.parseLong (inputString) < 0) throw new Exception ("You entered a negative number");
            return Long.parseLong (inputString);
        } catch (NumberFormatException e) {
            System.out.println ("Error! This variable will be assigned the default value random");
            return (long) (Math.random () * 1000000);
        }
    }
    public static int getNumberMenu() throws Exception {
        Scanner scanner = new Scanner (System.in);
        String inputString = scanner.nextLine ();
        try {
            if (Integer.parseInt (inputString) > 0 && Integer.parseInt (inputString) < 4 ) throw new Exception ("You entered an invalid number");
            return Integer.parseInt (inputString);
        } catch (NumberFormatException e) {
            System.out.println ("Error! You probably wanted to add a new customer");
            return 1;
        }
    }
}
