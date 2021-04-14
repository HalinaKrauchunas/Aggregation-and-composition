package com.epam.test13;

import java.util.*;

public class District {

    private final String name;
    private final ArrayList<City> cities = new ArrayList<> ();

    public District() {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Name district: ");
        this.name = scanner.nextLine ();
    }

    public ArrayList<City> getCities() {

        return cities;
    }

    public String getName() {

        return name;
    }

    public void addCity() {

        cities.add (new City ());
    }

    @Override
    public String toString() {

        return "District " + name + ": " + cities;
    }
}
