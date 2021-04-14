package com.epam.test8;

import java.util.*;

class Customers {

    static ArrayList<Customer> sortByName(ArrayList<Customer> customers) {

        Comparator<Customer> compareByName = Comparator.comparing (Customer::getName);
        customers.sort (compareByName);
        return customers;
    }

    static Customer getNumberCards(ArrayList<Customer> customers) throws Exception {

        System.out.println ("Enter initial limit");
        long min = Parser.getLong ();
        System.out.println ("Enter the end limit");
        long max = Parser.getLong ();
        for (Customer customer : customers) {
            if (Long.parseLong (customer.getNumberCard ()) >= min &&
                Long.parseLong (customer.getNumberCard ()) <= max) {
                return customer;
            }
        }
        return null;
    }
}