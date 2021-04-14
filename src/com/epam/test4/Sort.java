package com.epam.test4;

import java.util.*;

public class Sort {

    static ArrayList<Train> sortByNumber(ArrayList<Train> arrayList) {

        Comparator<Train> compareByNumberTrain = Comparator.comparingInt (Train::getNumberTrain);
        arrayList.sort (compareByNumberTrain);
        return arrayList;
    }

    public static ArrayList<Train> sortByName(ArrayList<Train> arrayList) {

        Comparator<Train> compareByName = Comparator.comparing (Train::getNamePlace);
        compareByName = compareByName.thenComparing (Train::getTime);
        arrayList.sort (compareByName);
        return arrayList;
    }
}
