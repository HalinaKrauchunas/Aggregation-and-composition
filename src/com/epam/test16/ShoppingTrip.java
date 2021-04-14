package com.epam.test16;

import java.util.*;

public class ShoppingTrip extends TravelVoucher {

    private final ArrayList<String> places;

    public ShoppingTrip() {

        super ();
        ArrayList<String> places = new ArrayList<> ();
        places.add ("New York");
        places.add ("Paris");
        places.add ("California");
        this.places = places;
    }

    public String choicePlace(Scanner scanner) {

        for (String place : places) {
            System.out.println ("Enter " + (places.indexOf (place) + 1) + " to choose " + place);
        }
        return places.get (scanner.nextInt () - 1);
    }

    @Override
    public String toString() {

        return "Shopping";
    }
}
