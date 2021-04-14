//7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади,
// периметра и точки пересечения медиан.

package com.epam.test7;

import static java.lang.Math.*;

public class Triangle {

    private static double a1, a2;
    private static double b1, b2;
    private static double c1, c2;

    @Override
    public String toString() {

        return "A: x=" + a1 + ", y=" + a2 +
            "\nB: x=" + b1 + ", y=" + b2 +
            "\nC: x=" + c1 + ", y=" + c2;
    }

    public Triangle(double a1, double a2, double b1, double b2, double c1, double c2) {

        Triangle.a1 = a1;
        Triangle.a2 = a2;
        Triangle.b1 = b1;
        Triangle.b2 = b2;
        Triangle.c1 = c1;
        Triangle.c2 = c2;
    }

    public Triangle() {

        this (7.0, 4.0, -9.0, -8.0, -2.0, 16.0);
    }

    public double area() {

        return 0.5 * abs (((b1 - a1) * (c2 - a2)) - ((c1 - a1) * (b2 - b1)));
    }

    public double medianPointA() {

        return (a1 + b1 + c1) / 3.0;
    }

    public double medianPointB() {

        return (a2 + b2 + c2) / 3.0;
    }

    public static double lengthAB() {

        return sqrt ((pow ((b1 - a1), 2)) + (pow ((b2 - a2), 2)));
    }

    public static double lengthBC() {

        return sqrt ((pow ((c1 - b1), 2)) + (pow ((c2 - b2), 2)));
    }

    public static double lengthAC() {

        return sqrt ((pow ((c1 - a1), 2)) + (pow ((c2 - a2), 2)));
    }

    public double perimeter() {

        return lengthAB () + lengthBC () + lengthAC ();
    }
}


