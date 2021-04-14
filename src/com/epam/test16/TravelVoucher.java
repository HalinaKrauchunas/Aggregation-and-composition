package com.epam.test16;

import java.util.*;

public abstract class TravelVoucher {

    private final ArrayList<Integer> countDays;
    private final ArrayList<String> foods;
    private final ArrayList<String> transports;


    public TravelVoucher() {
        ArrayList<String> transports = new ArrayList<> ();
        transports.add ("Bus");
        transports.add ("Plain");
        transports.add ("Train");
        transports.add ("Absent");
        this.transports = transports;

        ArrayList<Integer> countDays = new ArrayList<> ();
        countDays.add (2);
        countDays.add (3);
        countDays.add (5);
        countDays.add (10);
        this.countDays = countDays;

        ArrayList<String> foods = new ArrayList<> ();
        foods.add ("Absent");
        foods.add ("Just breakfast");
        foods.add ("Breakfast and lunch");
        foods.add ("Breakfast, lunch and dinner");
        this.foods = foods;
    }

    public String choiceFood(Scanner scanner) {

        for (String food : foods) {
            System.out.println ("Enter " + (foods.indexOf (food) + 1) + " to choose " + food);
        }
        return foods.get (scanner.nextInt () - 1);
    }

    public int choiceDays(Scanner scanner) {

        for (Integer days : countDays) {
            System.out.println ("Enter " + (countDays.indexOf (days) + 1) + " to choose " + days + " days.");
        }
        return countDays.get (scanner.nextInt () - 1);
    }

    public String choiceTransport(Scanner scanner) {

        for (String transport : transports) {
            System.out.println ("Enter " + (transports.indexOf (transport) + 1) + " to choose " + transport);
        }
        return transports.get (scanner.nextInt () - 1);
    }
}

