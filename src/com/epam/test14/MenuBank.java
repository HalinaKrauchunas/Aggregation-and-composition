package com.epam.test14;

import java.util.*;

public class MenuBank {

    public static void printMenuCustomer() {

        System.out.println (
            "1 - Print positive balance.\n" +
                "2 - Print negative balance.\n" +
                "3 - Print total balance\n" +
                "4 - Printing bank accounts in descending order of funds\n" +
                "5 - To up balance.\n" +
                "6 - Write of balance.\n" +
                "7 - Print all accounts number.\n" +
                "8 - Close.\n"
        );
    }

    public static void printMenuEmployee() {

        System.out.println (
            "1 - Add a new customer.\n" +
                "2 - Add a new bank account.\n" +
                "3 - Block accounts\n" +
                "4 - Unblock accounts\n" +
                "5 - Deleting an account\n" +
                "6 - Close. Login as customer.\n"
        );
    }
    public static int getNumberMenu()  {

        Scanner scanner = new Scanner (System.in);
        String inputString = scanner.nextLine ();
        try {
            return Integer.parseInt (inputString);
        } catch (NumberFormatException e) {
            System.out.println ("Error! You probably wanted to add a new customer");
            return 1;
        }
    }
}