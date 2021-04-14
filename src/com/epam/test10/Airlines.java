//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
package com.epam.test10;

import java.time.*;
import java.util.*;

public class Airlines {

    static void getAirlinesDestination(ArrayList<Airline> books) {

        System.out.println ("Enter name destination: ");
        Scanner scanner = new Scanner (System.in);
        String stringValue = scanner.nextLine ();
        for (Airline airline : books) {
            if (airline.getDestination ().equalsIgnoreCase (stringValue)) {
                System.out.println (airline);
            }
        }
    }

    static void getAirlinesByDays(ArrayList<Airline> books) {

        System.out.println ("Enter name days: ");
        Scanner scanner = new Scanner (System.in);
        String stringValue = scanner.nextLine ();
        for (Airline airline : books) {
            if (airline.getDaysOfTheWeek ().equalsIgnoreCase (stringValue)) {
                System.out.println (airline);
            }
        }
    }

    static void getAirlinesByDaysAndTime(ArrayList<Airline> books) {

        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter name days: ");
        String day = scanner.nextLine ();
        System.out.print ("departure time.\nHour:");
        int hour = scanner.nextInt ();
        System.out.print ("Minutes: ");
        int minutes = scanner.nextInt ();
        LocalTime time = LocalTime.of (hour, minutes);
        for (Airline airline : books) {
            if (airline.getDaysOfTheWeek ().equalsIgnoreCase (day)) {
                if (time.getHour () < airline.getDepartureTime ().getHour () || (time.getHour () == airline.getDepartureTime ().getHour () && time.getMinute () < airline.getDepartureTime ().getMinute ())) {
                    System.out.println (airline);
                }
            }
        }
    }
}
