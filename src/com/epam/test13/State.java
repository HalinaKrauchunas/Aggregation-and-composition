package com.epam.test13;

import java.util.*;

public class State {

    private final String name;
    private final String capital;
    private final ArrayList<Region> regions;

    public State(Scanner scanner) {

        System.out.print ("Name state: ");
        this.name = scanner.nextLine ();
        System.out.print ("Name capital: ");
        this.capital = scanner.nextLine ();
        this.regions = new ArrayList<> ();
    }

    public State(String name, String capital, ArrayList<Region> regions) {

        this.name = name;
        this.capital = capital;
        this.regions = regions;
    }

    @Override
    public String toString() {

        return "State " + name + ", capital " + capital + ".\n" + regions;
    }

    public String getName() {

        return name;
    }

    public ArrayList<Region> getRegions() {

        return regions;
    }

    public String getCapital() {

        return capital;
    }

    public void addRegion() {

        regions.add (new Region ());
    }

    public static void addNewDistrictToTheRegion(Scanner scanner, State state) {

        if (state.getRegions ().size () == 0) {
            System.out.println ("You have not created any regions\n");
        } else {
            for (Region region : state.getRegions ()) {
                int count = state.getRegions ().indexOf (region);
                System.out.println ("Enter " + (count + 1) + " to add a new district to the region \"" + region.getName () + "\"");
            }
        }
        state.getRegions ().get (scanner.nextInt () - 1).addDistrict ();
    }

    public static void printCapitalObj(State state) {

        for (Region region : state.getRegions ()) {
            for (District district : region.getDistricts ()) {
                for (City city : district.getCities ()) {
                    if (state.getCapital ().equalsIgnoreCase (city.getName ())) {
                        System.out.println (city);
                    } else {
                        System.out.println ("The capital of the state is " + state.getCapital () + ", but you didn't " +
                            "create such an object\n");
                    }
                }
            }
        }
    }

    public static void printStateArea(State state) {

        double sumArea = 0;
        for (Region region : state.getRegions ()) {
            sumArea += region.getArea ();
            System.out.println (sumArea);
        }
    }

    public void printRegionObj(State state) {

        for (Region region : state.getRegions ()) {
            System.out.println (region);
        }
    }

    public static void printNumberOfRegion(State state) {

        System.out.println ("Number of region: " + state.getRegions ().size ());
    }

    public static void addNewCityToTheDistrict(Scanner scanner, State state) {

        if (state.getRegions ().size () == 0) {
            System.out.println ("You have not created any regions\n");
        } else {
            for (Region region : state.getRegions ()) {
                if (region.getDistricts ().size () == 0) {
                    System.out.println ("You have not created more than one district in the region " + region.getName ());
                } else {
                    int count1 = state.getRegions ().indexOf (region);
                    System.out.println ("Entered " + (count1 + 1) + " that choice region \"" + region.getName () +
                        "\"");
                    int choiceReg = scanner.nextInt () - 1;
                    for (District district : state.getRegions ().get (choiceReg).getDistricts ()) {
                        int count = region.getDistricts ().indexOf (district);
                        System.out.println ("Entered " + (count + 1) + " that add in district \"" + district.getName () + "\" new " +
                            "City");
                        int choiceDistrict = scanner.nextInt () - 1;
                        state.getRegions ().get (choiceReg).getDistricts ().get (choiceDistrict).addCity ();
                    }
                }
            }
        }
    }
}
