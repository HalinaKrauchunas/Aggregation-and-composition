package com.epam.test13;

import java.util.*;

public class City {

    private final String name;
    private final int people;

    public String getName() {

        return name;
    }

    public int getPeople() {

        return people;
    }

    public City(String name, int people) {

        this.name = name;
        this.people = people;
    }

    public City() {

        super ();
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Name city: ");
        this.name = scanner.nextLine ();
        System.out.print ("Number of people: ");
        this.people = scanner.nextInt ();
    }

    @Override
    public String toString() {

        return "city " + name + ", people " + people;
    }
}

