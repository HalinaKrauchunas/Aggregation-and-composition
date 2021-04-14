package com.epam.test10;

import com.epam.test9.*;

import java.util.*;

import static com.epam.test10.Airlines.*;

public class Main {

    public static void main(String[] args) throws Exception {

        ArrayList<Airline> airlines = new ArrayList<> ();
        Scanner scanner = new Scanner (System.in);
        do {
            System.out.println (
                "1 - Add new airline\n" +
                    "2 - List of flights for a given destination\n" +
                    "3 - List of flights for a given day of the week\n" +
                    "4 - List of flights for a given day of the week, the departure time for which is greater than " +
                    "the given one"
            );
            int choice = Parser.getNumberMenu ();
            switch (choice) {
                case 1 -> airlines.add (Airline.getAirline (scanner));
                case 2 -> getAirlinesDestination (airlines);
                case 3 -> getAirlinesByDays (airlines);
                case 4 -> getAirlinesByDaysAndTime (airlines);
            }
        }
        while (airlines.size () < 10);
    }
}