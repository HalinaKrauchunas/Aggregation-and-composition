package com.epam.test6;

import java.util.*;

public class Parser {

    public static int getPositiveInt(Scanner scanner) throws Exception {

        String inputString = scanner.nextLine ();

        try {
            if (Integer.parseInt (inputString) < 0) throw new Exception ("You entered a negative number");
            return Integer.parseInt (inputString);
        } catch (NumberFormatException e) {
            System.out.println ("Error! This variable will be assigned the default value 0");
            return 61;
        }
    }
}