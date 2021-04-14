package com.epam.test14;

import java.util.*;

public class Customer {

    String name;
    String surname;
    ArrayList<BankAccount> bankAccounts;

    public Customer(String name, String surname) {

        this.name = name;
        this.surname = surname;
        this.bankAccounts = new ArrayList<> ();
    }

    public Customer() {

        System.out.print ("Name: ");
        Scanner scanner = new Scanner (System.in);
        this.name = scanner.nextLine ();
        System.out.print ("Surname: ");
        this.surname = scanner.nextLine ();
        this.bankAccounts = new ArrayList<> ();
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    @Override
    public String toString() {

        return "Customer{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", bankAccounts=" + bankAccounts +
            '}';
    }

    public void addBankAccount() {

        bankAccounts.add (new BankAccount ());
    }

    public void blockedAcc(Scanner scanner) {

        int count = 0;
        for (BankAccount bankAccount : bankAccounts) {
            count++;
            System.out.println ("Enter " + count + " to block account: " + bankAccount);
        }
        bankAccounts.get (scanner.nextInt () - 1).turnOff ();
    }

    public void unblockedAcc(Scanner scanner) {

        int count = 0;
        for (BankAccount bankAccount : bankAccounts) {
            count++;
            if (!bankAccount.isCurrentCondition ()) {
                System.out.println ("Enter " + count + " to unblock account: " + bankAccount);
                bankAccounts.get (scanner.nextInt () - 1).turnOn ();
            }
        }
    }

    public void topUpBalance(int choice) {

        if (bankAccounts.get (choice - 1).isCurrentCondition ()) {
            bankAccounts.get (choice - 1).setBalance (((bankAccounts.get (choice - 1).getBalance ()) + getMoney ()));
        } else {
            System.out.println ("Sorry, this account is blocked.\n");
        }
    }

    public void writeOfBalance(int choice) {

        if (bankAccounts.get (choice - 1).isCurrentCondition ()) {
            bankAccounts.get (choice - 1).setBalance (((bankAccounts.get (choice - 1).getBalance ()) - getMoney ()));
        } else {
            System.out.println ("Sorry, this account is blocked.\n");
        }
    }

    public double getMoney() {

        Scanner scanner = new Scanner (System.in);
        System.out.print ("Enter the sum: ");
        return Double.parseDouble (String.valueOf (scanner.nextDouble ()));
    }

    public int getChoiceBankAccount() {

        Scanner scanner = new Scanner (System.in);
        int count = 0;
        for (BankAccount bankAccount : bankAccounts) {
            count++;
            System.out.println ("Enter " + count + " to choose an account: " + bankAccount);
        }
        return scanner.nextInt ();
    }

    public void printTotalBalance() {

        double sum = 0;
        for (BankAccount bankAccount : bankAccounts) {
            sum += bankAccount.getBalance ();
        }
        System.out.println ("Total balance: " + sum);
    }

    public void printPositiveBalance() {

        double sum = 0;
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getBalance () > 0) {
                sum += bankAccount.getBalance ();
            }
        }
        System.out.println ("Positive balance: " + sum);
    }

    public void printNegativeBalance() {

        double sum = 0;
        for (BankAccount bankAccount : bankAccounts) {
            if (bankAccount.getBalance () < 0) {
                sum += bankAccount.getBalance ();
            }
        }
        System.out.println ("Negative balance: " + sum);
    }

    public void printDescendingSortBalance() {

        Comparator<BankAccount> compareBalance = Comparator.comparingDouble (BankAccount::getBalance);
        bankAccounts.sort (compareBalance);
        for (BankAccount bankAccount : bankAccounts) {
            System.out.println (bankAccount);
        }
    }

    public void printAllAccountsNumber() {

        for (BankAccount bankAccount : bankAccounts) {
            System.out.println (bankAccount.getAccountNumber ());
        }
    }

    public void deletingAccount(int choice) {

        bankAccounts.remove (choice);
        System.out.println ("Bank account deleted.\n");
    }
}