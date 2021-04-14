package com.epam.test9;

import java.util.*;

import static com.epam.test9.Books.*;

public class Main {

    public static void main(String[] args) throws Exception {

        ArrayList<Book> books = new ArrayList<> ();
        Scanner scanner = new Scanner (System.in);

        Book book = new Book (
            "Fried Green Tomatoes at the Whistle Stop Cafe",
            "Fannie Flagg",
            "Random House",
            1987,
            8,
            34
        );
        books.add (book);

        do {
            System.out.println (
                "1 - Add new book\n" +
                    "2 - List the books of the given author\n" +
                    "3 - List books from a given publisher\n" +
                    "4 - List books published after a given year"
            );
            int choice = Parser.getNumberMenu ();
            switch (choice) {
                case 1 -> books.add (Book.getBook (scanner));
                case 2 -> getBooksAuthor (books);
                case 3 -> getBooksPublisher (books);
                case 4 -> getBooksAfterYear (books);
            }
        }
        while (books.size () < 10);
    }
}