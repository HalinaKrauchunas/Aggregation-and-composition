package com.epam.test12;

import java.util.*;

public class Car {

    public static final double FUEL_CONSUMPTION_PER_100_KM = 7.0;
    private double fuel;
    private final Engine engine;
    private final ArrayList<Wheel> wheels;
    private String model;

    public String getModel() {

        return model;
    }

    public Car() {

        this.engine = new Engine ();
        this.wheels = new ArrayList<> ();
    }

    public void go() {

        if (wheels.size () == 4 && fuel > 0 && engine.getIsTurnedOn ()) {
            double km = getKm ();
            km = howMuchCanGo (km);
            fuel -= km * FUEL_CONSUMPTION_PER_100_KM / 100;
            System.out.println ("Car drives " + km + " km, fuel in the tank is " + fuel + " litres.");
            lowerTheWheel ();
            engine.turnOff ();
        } else {
            wheelsCheck ();
            fuelCheck ();
            engineCheck ();
        }
    }

    public void wheelsCheck() {

        if (wheels.size () < 4) System.out.println ("Not enough wheels(" + wheels.size () + ")");
    }

    public void engineCheck() {

        if (!engine.getIsTurnedOn ()) System.out.print ("The engine is not running. Turn it on.\n");
    }

    public void fuelCheck() {

        if (fuel <= 0) System.out.print ("There's no fuel!\n");
    }

    private double howMuchCanGo(double km) {

        double possibleWay = 100 * fuel / FUEL_CONSUMPTION_PER_100_KM;
        if (possibleWay < km) {
            System.out.println ("There is only enough fuel for " + possibleWay
                + " km, then need to refuel.");
            km = possibleWay;
        }
        return km;
    }

    private double getKm() {

        Scanner scanner = new Scanner (System.in);
        System.out.print ("How many kilometers will we drive?\n");
        return scanner.nextDouble ();
    }

    public void plusFuel() {

        engine.turnOff ();
        int money = getMoney ();
        fuel = money / 2.5;
    }

    private int getMoney() {

        Scanner scanner = new Scanner (System.in);
        System.out.println ("How much money do you have?\n");
        return scanner.nextInt ();
    }

    public void startingTheEngine() {

        if (!engine.getIsTurnedOn ()) {
            engine.turnOn ();
        }
    }

    public void lowerTheWheel() {

        int count = 0;
        int a = (int) Math.floor (Math.random () * 4);
        while (count < a) {
            count++;
            wheels.remove (0);
        }
        System.out.println ("You punched wheels: " + (4 - wheels.size ()));
    }

    public void newWheel() {

        if (wheels.size () == 4) {
            System.out.println ("Wheels are enough\n");
        } else {
            wheels.add (new Wheel ());
            System.out.println ("Current number of wheels: " + wheels.size ());
        }
    }

    public void printFuel() {

        System.out.println (fuel + " liters");
    }

    public void printCountWheels() {

        System.out.println (wheels.size () + " wheels");
    }

    public void enterCarMake() {

        System.out.println ("Enter car model: ");
        Scanner scanner = new Scanner (System.in);
        this.model = scanner.nextLine ();
    }

    public void printCarModel() {

        System.out.println ("Model:" + getModel ());
    }
}