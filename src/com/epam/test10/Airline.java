//    Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
package com.epam.test10;

import java.time.*;
import java.util.*;

public class Airline {

    private String destination, flightNumber, daysOfTheWeek;
    private LocalTime departureTime;

    @Override
    public String toString() {

        return "Airline{" +
            "destination='" + destination + '\'' +
            ", flightNumber='" + flightNumber + '\'' +
            ", daysOfTheWeek='" + daysOfTheWeek + '\'' +
            ", departureTime=" + departureTime +
            '}';
    }

    public String getDestination() {

        return destination;
    }

    public void setDestination(String destination) {

        this.destination = destination;
    }

    public String getFlightNumber() {

        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {

        this.flightNumber = flightNumber;
    }

    public String getDaysOfTheWeek() {

        return daysOfTheWeek;
    }

    public void setDaysOfTheWeek(String daysOfTheWeek) {

        this.daysOfTheWeek = daysOfTheWeek;
    }

    public LocalTime getDepartureTime() {

        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {

        this.departureTime = departureTime;
    }

    public static Airline getAirline(Scanner scanner) throws Exception {

        Airline airline = new Airline ();
        System.out.print ("destination: ");
        airline.destination = scanner.nextLine ();
        System.out.print ("flightNumber: ");
        airline.flightNumber = scanner.nextLine ();
        System.out.print ("daysOfTheWeek: ");
        airline.daysOfTheWeek = scanner.nextLine ();
        System.out.print ("departure time:\nHour:\n");
        int hour = scanner.nextInt ();
        System.out.print ("Minutes: ");
        int minutes = scanner.nextInt ();
        airline.departureTime = LocalTime.of (hour, minutes);
        return airline;
    }
}