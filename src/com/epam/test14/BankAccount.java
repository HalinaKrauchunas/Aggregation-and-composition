package com.epam.test14;

import java.util.*;

public class BankAccount {

    private final String accountNumber;
    private double balance;
    private boolean currentCondition;

    public BankAccount(String accountNumber, double balance) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currentCondition = true;
    }

    public BankAccount() {

        this.accountNumber = UUID.randomUUID ().toString ();
        this.balance = 0.0;
        this.currentCondition = true;
    }

    public String getAccountNumber() {

        return accountNumber;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public boolean isCurrentCondition() {

        return currentCondition;
    }


    public void turnOn() {

        this.currentCondition = true;
        System.out.println ("Current account is not blocked\n");
    }

    public void turnOff() {

        this.currentCondition = false;
        System.out.println ("Current account is blocked\n");
    }

    @Override
    public String toString() {

        return "BankAccount{" +
            "accountNumber='" + accountNumber + '\'' +
            ", balance=" + balance +
            ", currentCondition=" + currentCondition +
            '}';
    }
}
