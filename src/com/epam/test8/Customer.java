//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
// метод  toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и
// методами. Задать критерии выбора данных и вывести эти данные на консоль.
//    Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
package com.epam.test8;

import java.util.*;
import java.util.Scanner;

public class Customer {

    private String itemId;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private String numberCard;
    private String numberBankAccount;

    @Override
    public String toString() {

        return "ID: " + itemId + ", " +
            "surname: " + surname + ", " +
            "name: " + name + ", " +
            "patronymic: " + patronymic + ", " +
            "address: " + address + ',' +
            "number card: " + numberCard + ", " +
            "number account: " + numberBankAccount + ";\n";
    }

    public String getItemId() {

        return itemId;
    }

    public void setItemId(String itemId) {

        this.itemId = itemId;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getPatronymic() {

        return patronymic;
    }

    public void setPatronymic(String patronymic) {

        this.patronymic = patronymic;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getNumberCard() {

        return numberCard;
    }

    public void setNumberCard(String numberCard) {

        this.numberCard = numberCard;
    }

    public String getNumberBankAccount() {

        return numberBankAccount;
    }

    public void setNumberBankAccount(String numberBankAccount) {

        this.numberBankAccount = numberBankAccount;
    }

    public Customer(
        String surname,
        String name,
        String patronymic,
        String address,
        String numberCard,
        String numberBankAccount
    ) {

        this.itemId = UUID.randomUUID ().toString ();
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.numberCard = numberCard;
        this.numberBankAccount = numberBankAccount;
    }

    public static Customer getCustomer(Scanner scanner) throws Exception {

        Customer customer = new Customer ("", "", "", "", "", "");
        System.out.print ("surname: ");
        customer.surname = scanner.nextLine ();
        System.out.print ("name: ");
        customer.name = scanner.nextLine ();
        System.out.print ("patronymic: ");
        customer.patronymic = scanner.nextLine ();
        System.out.print ("address: ");
        customer.address = scanner.nextLine ();
        System.out.print ("number card: ");
        customer.numberCard = String.valueOf (Parser.getLong ());
        System.out.print ("number account: ");
        customer.numberBankAccount = scanner.nextLine ();
        return customer;
    }
}
