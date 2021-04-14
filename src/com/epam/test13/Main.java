package com.epam.test13;

import java.util.*;

import static com.epam.test11.Menu.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        State state = new State (scanner);
        int close = 0;
        while (close != 9) {
            Menu.printMenu ();
            int choice = Menu.getNumberMenu ();
            switch (choice) {
                case 1 -> state.addRegion ();
                case 2 -> State.addNewDistrictToTheRegion (scanner, state);
                case 3 -> State.addNewCityToTheDistrict (scanner, state);
                case 4 -> State.printCapitalObj (state);
                case 5 -> State.printNumberOfRegion (state);
                case 6 -> state.printRegionObj (state);
                case 7 -> State.printStateArea (state);
                case 8 -> System.out.println (state);
                case 9 -> close = 9;
            }
        }
    }
}