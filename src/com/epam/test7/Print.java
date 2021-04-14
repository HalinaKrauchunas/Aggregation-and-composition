package com.epam.test7;

public class Print {

    static void print(Triangle triangle1) {

        System.out.println (triangle1);
        System.out.println ("Area: " + triangle1.area ());
        System.out.println ("Points median: (" + triangle1.medianPointA () + ", " + triangle1.medianPointB () + ")");
        System.out.println ("Perimeter: " + triangle1.perimeter ());
    }
}
