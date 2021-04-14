package com.epam.test14;

import java.util.*;

public class Bank {

    String name;
    ArrayList<Customer> customers;

    public Bank() {

        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter name bank: ");
        this.name = scanner.nextLine ();
        this.customers = new ArrayList<> ();
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getChoiceCustom() {

        if (customers.size () > 0) {
            Scanner scanner = new Scanner (System.in);
            int count = 0;
            for (Customer customer : customers) {
                count++;
                System.out.println ("Enter " + count + " to choose a customer: " + customer);
            }
            return scanner.nextInt () - 1;
        }
        System.out.println ("There are no users in this bank.\n");
        return 0;
    }

    public int login(Scanner scanner) {

        if (customers.size () > 0) {
            System.out.println ("Enter your surname: ");
            String surname = scanner.nextLine ();
            Integer indexCustom = searchIndexCustomBySurname (surname);
            if (indexCustom != null) return indexCustom;
        } else {
            System.out.println ("There are no users in this bank.\n");
        }
        System.out.println ("We create a new user and open an account for him.\n");
        Customer customer = new Customer ();
        customers.add (customer);
        customer.addBankAccount ();
        return 0;
    }

    public Integer searchIndexCustomBySurname(String surname) {

        for (Customer customer : customers) {
            if (customer.getSurname ().equalsIgnoreCase (surname)) {
                System.out.println ("Your accounts: " + customer);
                return customers.indexOf (customer);
            } else {
                System.out.println ("You are not logged in.\n");
            }
        }
        return null;
    }
}

