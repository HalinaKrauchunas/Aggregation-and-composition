//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
// toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. Задать
// критерии выбора данных и вывести эти данные на консоль.
//    Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
package com.epam.test9;

import java.util.*;

public class Book {

    private String itemId;
    private String name;
    private String author;
    private String publishingOutfit;
    private Integer yearForPublication;
    private long quantity;
    private long price;

    @Override
    public String toString() {

        return "Book." + "\n" +
            "Name: '" + name + '\'' + "," + "\n" +
            "Author: '" + author + '\'' + "," + "\n" +
            "Publishing outfit: '" + publishingOutfit + '\'' + "," + "\n" +
            "Year for publication: " + yearForPublication + "," + "\n" +
            "Quantity: " + quantity + "," + "\n" +
            "ID: '" + itemId + '\'' + "," + "\n" +
            "Price: " + price + ".\n" + "\n";
    }

    public Book(
        String name,
        String author,
        String publishingOutfit,
        Integer yearForPublication,
        long quantity,
        long price

    ) {

        this.name = name;
        this.author = author;
        this.publishingOutfit = publishingOutfit;
        this.yearForPublication = yearForPublication;
        this.quantity = quantity;
        this.itemId = UUID.randomUUID ().toString ();
        this.price = price;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {

        this.author = author;
    }

    public String getPublishingOutfit() {

        return publishingOutfit;
    }

    public void setPublishingOutfit(String publishingOutfit) {

        this.publishingOutfit = publishingOutfit;
    }

    public Integer getYearForPublication() {

        return yearForPublication;
    }

    public void setYearForPublication(Integer yearForPublication) {

        this.yearForPublication = yearForPublication;
    }

    public long getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }

    public String getItemId() {

        return itemId;
    }

    public void setItemId(String itemId) {

        this.itemId = itemId;
    }

    public long getPrice() {

        return price;
    }

    public void setPrice(long price) {

        this.price = price;
    }

    public static Book getBook(Scanner scanner) throws Exception {

        Book book = new Book ("", "", "", 0, 0, 0);
        System.out.print ("name: ");
        book.name = scanner.nextLine ();
        System.out.print ("author: ");
        book.author = scanner.nextLine ();
        System.out.println ("publishing Outfit: ");
        book.publishingOutfit = scanner.nextLine ();
        System.out.print ("year for publication: ");
        book.yearForPublication = scanner.nextInt ();
        System.out.print ("quantity: ");
        book.quantity = scanner.nextLong ();
        System.out.print ("price: ");
        book.price = scanner.nextLong ();
        return book;
    }
}