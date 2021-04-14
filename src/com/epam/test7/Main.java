package com.epam.test7;

import java.util.*;
import static com.epam.test7.Parser.*;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println ("Enter coordinates of vertex A:");
        double a1 = getDouble (scanner);
        double a2 = getDouble (scanner);

        System.out.println ("Enter coordinates of vertex B:");
        double b1 = getDouble (scanner);
        double b2 = getDouble (scanner);

        System.out.println ("Enter coordinates of vertex C:");
        double c1 = getDouble (scanner);
        double c2 = getDouble (scanner);

        Triangle triangle1 = new Triangle (a1, a2, b1, b2, c1, c2);
        printTriangle (triangle1);

        Triangle triangle2 = new Triangle ();
        printTriangle (triangle2);
    }
}
