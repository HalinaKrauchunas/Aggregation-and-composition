package com.epam.test12;

import static com.epam.test11.Menu.*;

public class Test {

    public static void main(String[] args) {
        Car car = new Car();
        int close = 0;
        while (close != 9) {
            Menu.printMenu ();
            int choice = Menu.getNumberMenu ();
            switch (choice) {
                case 1 -> car.go ();
                case 2 -> car.plusFuel ();
                case 3 -> car.startingTheEngine ();
                case 4 -> car.newWheel ();
                case 5 -> car.printCountWheels ();
                case 6 -> car.printFuel ();
                case 7 -> car.enterCarMake ();
                case 8 -> car.printCarModel ();
                case 9 -> close = 9;
            }
        }
    }
}
