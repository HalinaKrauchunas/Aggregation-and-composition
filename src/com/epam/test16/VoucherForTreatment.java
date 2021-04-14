package com.epam.test16;


import java.util.*;

public class VoucherForTreatment extends TravelVoucher {
    private final String type = "Sanatoriums";
    private final ArrayList<String> sanatoriums;

    public VoucherForTreatment() {

        super ();
        ArrayList<String> sanatoriums = new ArrayList<> ();
        sanatoriums.add ("Karlovy Vary");
        sanatoriums.add ("Borjomy");
        sanatoriums.add ("Jurmala");
        this.sanatoriums = sanatoriums;
    }

    public String getType() {

        return type;
    }
    public String choiceSanatorium(Scanner scanner){
        for (String sanatorium : sanatoriums) {
            System.out.println ("Enter " + (sanatoriums.indexOf (sanatorium) + 1) + " to choose " + sanatorium);
        }
        return sanatoriums.get (scanner.nextInt () - 1);
    }

    @Override
    public String toString() {

        return type;

    }
}
