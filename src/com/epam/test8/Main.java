package com.epam.test8;

import java.util.*;

import static com.epam.test8.Customer.*;
import static com.epam.test8.Customers.*;

public class Main {

    public static void main(String[] args) throws Exception {

        ArrayList<Customer> customers = new ArrayList<> ();
        Scanner scanner = new Scanner (System.in);
        do {
            System.out.println (
                "1 - Add new customer\n" +
                    "2 - Information about all customers\n" +
                    "3 - Withdrawing customers with a credit card in the interval\n"
            );
            int choice = Parser.getNumberMenu ();
            switch (choice) {
                case 1 -> customers.add (getCustomer (scanner));
                case 2 -> System.out.println (sortByName (customers));
                case 3 -> System.out.println (getNumberCards (customers));
            }
        }
        while (customers.size ()<10);
    }
}