package com.epam.test9;

import java.util.*;

public class Parser {

    public static int getPositiveLong(String stringValue) throws Exception {

        try {
            if (Long.parseLong (stringValue) < 0) throw new Exception ("You entered a negative number");
            return Integer.parseInt (String.valueOf (stringValue));
        } catch (NumberFormatException e) {
            System.out.println ("Error! This variable will be assigned the default value 1990");
            return 1990;
        }
    }

    public static int getNumberMenu()  {

        Scanner scanner = new Scanner (System.in);
        String inputString = scanner.nextLine ();
        try {
            return Integer.parseInt (inputString);
        } catch (NumberFormatException e) {
            System.out.println ("Error! You probably wanted to add a new object");
            return 1;
        }
    }
}
