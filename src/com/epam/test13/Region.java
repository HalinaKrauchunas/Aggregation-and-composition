package com.epam.test13;

import java.util.*;

public class Region {

    private final String name;
    private final double area;
    private final ArrayList<District> districts;

    public Region() {

        Scanner scanner = new Scanner (System.in);
        System.out.print ("Name region: ");
        this.name = scanner.nextLine ();
        System.out.print ("Area: ");
        this.area = Double.parseDouble (scanner.nextLine ());
        this.districts = new ArrayList<> ();
    }

    public Region(String name, double area) {

        this.name = name;
        this.area = area;
        this.districts = new ArrayList<> ();
    }

    public double getArea() {

        return area;
    }

    public String getName() {

        return name;
    }

    public ArrayList<District> getDistricts() {
        return districts;
    }

    public void addDistrict() {

        districts.add (new District ());
    }

    @Override
    public String toString() {

        return "Region " + name + ", area " + area + ":" + districts;
    }
}
