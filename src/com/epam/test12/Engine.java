package com.epam.test12;

public class Engine {

    private boolean isTurnedOn;

    public Engine() {

        this.isTurnedOn = false;
    }

    public boolean getIsTurnedOn() {

        return isTurnedOn;
    }

    public void turnOn() {
        this.isTurnedOn = true;
        System.out.println("Engine is started!");
    }

    public void turnOff() {
       this.isTurnedOn = false;
        System.out.println("Turn off the engine.");
    }
}