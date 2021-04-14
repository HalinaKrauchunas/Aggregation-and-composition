package com.epam.test16;

import java.util.*;

public class ExcursionVoucher extends TravelVoucher {

    private final ArrayList<String> cities;


    public ExcursionVoucher() {

        super ();
        ArrayList<String> cities = new ArrayList<> ();
        cities.add ("Moscow");
        cities.add ("Lvov");
        cities.add ("Minsk");
        this.cities = cities;
    }

    public String choiceCity(Scanner scanner){
        for (String city : cities) {
            System.out.println ("Enter " + (cities.indexOf (city) + 1) + " to choose " + city);
        }
        return cities.get (scanner.nextInt () - 1);
    }

    @Override
    public String toString() {

        return "Excursion";

    }
}

