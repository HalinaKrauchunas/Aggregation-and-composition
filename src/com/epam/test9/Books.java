//    a) список книг заданного автора;
//    b) список книг, выпущенных заданным издательством;
//    c) список книг, выпущенных после заданного года.

package com.epam.test9;

import java.util.*;

public class Books {

    static void getBooksAuthor(ArrayList<Book> books) {
        System.out.println ("Enter name author: ");
        Scanner scanner = new Scanner (System.in);
        String stringValue = scanner.nextLine ();
        for (Book book : books) {
            if (book.getAuthor ().equalsIgnoreCase (stringValue)) {
                System.out.println (book);
            }
        }
    }

    static void getBooksPublisher(ArrayList<Book> books) {
        System.out.println ("Enter name publisher: ");
        Scanner scanner = new Scanner (System.in);
        String stringValue = scanner.nextLine ();
        for (Book book : books) {
            if (book.getPublishingOutfit ().equalsIgnoreCase (stringValue)) {
                System.out.println (book);
            }
        }
    }

    static void getBooksAfterYear(ArrayList<Book> books) throws Exception {
        System.out.println ("Enter year: ");
        Scanner scanner = new Scanner (System.in);
        String stringValue = scanner.nextLine ();
        for (Book book : books) {
            if (Parser.getPositiveLong (stringValue) < book.getYearForPublication ()) {
                System.out.println (book);
            }
        }
    }
}