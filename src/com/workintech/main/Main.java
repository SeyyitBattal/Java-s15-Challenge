package com.workintech.main;

import com.workintech.enums.Categories;
import com.workintech.library.*;

import java.awt.print.Book;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryOrganisation();
    }

    public static void LibraryOrganisation() {
        Books book1 = new Books(1, "Dönüşüm", "Franz Kafka", Categories.SCIENCE_FICTION);
        Books book2 = new Books(2, "Babamı Beklerken", "Clare Vanderpool", Categories.ADVENTURE);
        Books book3 = new Books(3, "Dünyanın ilk günü", "Beyazit Akman", Categories.ADVENTURE);
        Books book4 = new Books(4, "Yarın yokum", "Lee Child", Categories.ACTION);
        Books book5 = new Books(5, "Suç ve ceza", "Dostoyevski", Categories.SCIENCE_FICTION);
        Books book6 = new Books(6, "Hayatın İçinden", "Cüneyd Suavi", Categories.ACTION);
        Books book7 = new Books(7, "Olağan Psikopatlar", "Kevin Dutton", Categories.SCIENCE_FICTION);
        Books book8 = new Books(8, "Canlı Devre", "David Eagleman", Categories.ACTION);
        Books book9 = new Books(9, "Var mısın?", "Doğan Cüceloğlu", Categories.ADVENTURE);
        Books books10 = new Books(10, "Uçurtma Avcısı", "Khaled Hosseini", Categories.ADVENTURE);
        Books book11 = new Books(11, "Beyin", "David Eagleman", Categories.ACTION);

        Library library = new Library();
        library.addLibraryList(book1);
        library.addLibraryList(book2);
        library.addLibraryList(book3);
        library.addLibraryList(book4);
        library.addLibraryList(book5);
        library.addLibraryList(book6);
        library.addLibraryList(book7);
        library.addLibraryList(book8);
        library.addLibraryList(book9);
        library.addLibraryList(books10);
        library.addLibraryList(book11);
        library.listAllBooks();
        System.out.println("*************************");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! \n" +
                "If you Librarian push \"L\" " +
                "If you User push \"U\" " +
                "for exit \"E\" ");
        while (true) {
            try {
                String process = scanner.next().toLowerCase();
                switch (process) {
                    case "e":
                        System.exit(0);
                        break;
                    case "u":
                        System.out.println("USER");
                        break;
                    case "l":
                        System.out.println("LIBRARIAN");
                        System.out.println("Add book: \"A\" delete book: \"D\"");
                        String librarian = scanner.next().toLowerCase();
                        switch (librarian) {
                            case "a":
                                System.out.println("Enter book ID: ");
                                String bookID = scanner.next();
                                System.out.println("Enter book name: ");
                                String bookName = scanner.next();
                                System.out.println("Enter book author: ");
                                String bookAuthor = scanner.next();
                                System.out.println("Enter book category: ");
                                String bookCategory = scanner.next();
                                System.out.println("Your book's information: " +
                                        "Book ID: " + bookID +
                                        " / Book name:" + bookName +
                                        " / Book author: " + bookAuthor +
                                        " / Book category: " + bookCategory);
                                break;
                            case "d":
                                System.out.println("You pushed d");
                                break;
                        }

                    default:
                        break;
                }

            } catch (Exception ex) {
                System.out.println("Invalid choosing");
                break;
            }
        }


        System.out.println("**************************");
        System.out.println("Science Books: \n" + Users.scienceCategory);
        System.out.println("***");
        System.out.println("Adventure Books: \n" + Users.adventureCategory);
        System.out.println("***");
        System.out.println("Action Books: \n" + Users.actionCategory);

    }


}