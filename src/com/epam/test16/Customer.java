package com.epam.test16;

import java.util.*;

public class Customer {

    private String name;
    private final String food;
    private final String transport;
    private final Integer day;
    private final TravelVoucher travelChoice;
    private final String place;
    private final ArrayList<TravelVoucher> travelVouchers;

    public Customer() {
        ArrayList<TravelVoucher> travelVouchers = new ArrayList<> ();
        travelVouchers.add (new ShoppingTrip ());
        travelVouchers.add (new ExcursionVoucher ());
        travelVouchers.add (new VoucherForTreatment());
        this.travelVouchers = travelVouchers;
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Name: ");
        this.name = scanner.nextLine ();
        this.travelChoice = choiceTravel (scanner);
        this.place = additionalChoice (scanner);
        this.day = this.travelChoice.choiceDays (scanner);
        this.food = this.travelChoice.choiceFood (scanner);
        this.transport = this.travelChoice.choiceTransport (scanner);
    }

    public String additionalChoice(Scanner scanner) {

        if (new ShoppingTrip ().equals (travelChoice)) {
         return new ShoppingTrip ().choicePlace (scanner);
        } else if (new ExcursionVoucher ().equals (travelChoice)) {
            return new ExcursionVoucher ().choiceCity (scanner);
        } else if (new VoucherForTreatment ().equals (travelChoice)) {
            return new VoucherForTreatment ().choiceSanatorium (scanner);
        }
        return null;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }


    public TravelVoucher choiceTravel(Scanner scanner) {
        for (TravelVoucher travelVoucher : travelVouchers) {
            System.out.println ("Enter " + (travelVouchers.indexOf (travelVoucher) + 1) + " to choose " + travelVoucher);
        }
        return travelVouchers.get (scanner.nextInt () - 1);
    }

    @Override
    public String toString() {

        return "Customer{" +
            "name='" + name + '\'' +
            ", travelChoice=" + travelChoice +
            ", place='" + place + '\'' +
            ", day=" + day +
            ", transport='" + transport + '\'' +
            ", food='" + food + '\'' +
            '}';
    }
}
