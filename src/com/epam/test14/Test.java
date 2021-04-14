package com.epam.test14;

import java.util.*;

import static com.epam.test11.Menu.*;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        Bank bank = new Bank ();
        int close1 = 0;
        while (close1 != 6) {
            MenuBank.printMenuEmployee ();
            int choice1 = getNumberMenu ();
            Customer customer;
            switch (choice1) {
                case 1 -> bank.customers.add (new Customer ());
                case 2 -> bank.customers.get (bank.getChoiceCustom ()).addBankAccount ();
                case 3 -> bank.customers.get (bank.getChoiceCustom ()).blockedAcc (scanner);
                case 4 -> bank.customers.get (bank.getChoiceCustom ()).unblockedAcc (scanner);
                case 5 -> {
                    customer = bank.customers.get (bank.getChoiceCustom ());
                    customer.deletingAccount (customer.getChoiceBankAccount ());
                }
                case 6 -> {
                    close1 = 6;
                    int indexCustom = bank.login (scanner);
                    Customer thisCustomer = bank.customers.get (indexCustom);
                    int close2 = 0;
                    while (close2 != 8) {
                        MenuBank.printMenuCustomer ();
                        int choice2 = getNumberMenu ();
                        switch (choice2) {
                            case 1 -> thisCustomer.printPositiveBalance ();
                            case 2 -> thisCustomer.printNegativeBalance ();
                            case 3 -> thisCustomer.printTotalBalance ();
                            case 4 -> thisCustomer.printDescendingSortBalance ();
                            case 5 -> thisCustomer.topUpBalance (thisCustomer.getChoiceBankAccount ());
                            case 6 -> thisCustomer.writeOfBalance (thisCustomer.getChoiceBankAccount ());
                            case 7 -> thisCustomer.printAllAccountsNumber ();
                            case 8 -> close2 = 8;
                        }
                    }
                }
            }
        }
    }
}