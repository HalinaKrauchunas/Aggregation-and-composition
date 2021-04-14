package com.epam.test6;

import java.util.*;

import static com.epam.test6.Parser.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner (System.in);
        int hour = getPositiveInt (scanner);
        int minutes = getPositiveInt (scanner);
        int seconds = getPositiveInt (scanner);
        Time time1 = new Time (hour, minutes, seconds);
        System.out.println (time1.toStringHour () + time1.toStringMinutes () + time1.toStringSeconds ());

        Time time2 = new Time (27, 65, 59);
        System.out.println (time2.toStringHour () + time2.toStringMinutes () + time2.toStringSeconds ());

        Time time3 = new Time ();
        System.out.println (time3.toStringHour () + time3.toStringMinutes () + time3.toStringSeconds ());
    }
}