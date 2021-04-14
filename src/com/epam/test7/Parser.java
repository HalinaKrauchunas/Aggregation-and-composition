package com.epam.test7;

import java.util.*;

import static com.epam.test7.Triangle.*;

public class Parser {

    public static Double getDouble(Scanner scanner) {

        String inputString = scanner.nextLine ();
        try {
            return Double.parseDouble (inputString);
        } catch (NumberFormatException e) {
            System.out.println ("Error! You entered not a number. This variable will be assigned the default value 1.0");
            return 1.0;
        }
    }

    static void printTriangle(Triangle triangle) {

        try {
            if (lengthAB () < lengthBC () + lengthAC ()) {
                if (lengthBC () < lengthAB () + lengthAC ()) {
                    Print.print (triangle);
                }
            }
        } catch (Exception e) {
            System.out.println ("This is not a triangle!");
        }
    }
}
