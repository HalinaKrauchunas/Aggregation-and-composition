package com.epam.test4;

import java.util.*;

import static com.epam.test4.Sort.*;

public class Main {

    public static void main(String[] args) {

        Train[] trains = new Train[5];
        ArrayList<Train> arrayList = new ArrayList<> (5);
        arrayList.add (trains[0] = new Train ("Minsk", 1, "18:02"));
        arrayList.add (trains[1] = new Train ("Grodno", 56, "02:11"));
        arrayList.add (trains[2] = new Train ("Moscow", 11, "08:20"));
        arrayList.add (trains[3] = new Train ("Lvov", 9, "06:00"));
        arrayList.add (trains[4] = new Train ("Moscow", 5, "19:08"));

        System.out.println ("Enter number rain ");
        Scanner scanner = new Scanner (System.in);
        String number = scanner.nextLine ();
        infoByNumber (trains, number);

        System.out.println (sortByNumber (arrayList));
        System.out.println (sortByName (arrayList));
    }

    private static void infoByNumber(Train[] trains, Object number) {

        for (Train train : trains) {
            if (train.getNumberTrain () == Integer.parseInt ((String) number)) System.out.println (train);
        }
    }
}


