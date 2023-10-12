package com.workintech.main;

import com.workintech.enums.Categories;
import com.workintech.interfaces.Actionable;
import com.workintech.library.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryOrganisation();
    }

    private static void LibraryOrganisation() {
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
                        Users user = new Users();
                        System.out.println("USER");
                        System.out.println("For borrowing \"B\" giving back \"G\" ");
                        String userChoosing = scanner.next().toLowerCase();

                        switch (userChoosing) {
                            case "b":
                                System.out.println("Enter book name for borrow: ");
                                String userBorrow = scanner.next().toLowerCase();
                                userBorrow = userBorrow.replaceAll(" ", "");
                                boolean isBookInUser = false;

                                for (Books book : library.getAllBooks()) {
                                    String bookInLibrary = book.getName().replaceAll(" ", "").toLowerCase();
                                    if (bookInLibrary.contains(userBorrow)) {
                                        user.addUserList(book);
                                        System.out.println(book.getName() + " => This book added to your list.");
                                        System.out.println(user);
                                        int bookCounter = Users.usersBooks.size();
                                        System.out.println("For " + bookCounter + " book you have to pay " + (bookCounter * 15) + "$");
                                        isBookInUser = true;
                                    }
                                }

                                if (!isBookInUser) System.out.println(userBorrow + " isn't in our library.");
                                break;


                            case "g":
                                System.out.println("Enter book name for give it back: ");
                                String userGiveBack = scanner.next().toLowerCase();
                                userGiveBack = userGiveBack.replaceAll(" ", "");
                                boolean isBookLibrary = false;
                                for (Books book : Users.usersBooks) {
                                    String bookInUser = book.getName().replaceAll(" ", "").toLowerCase();
                                    if (bookInUser.contains(userGiveBack)) {
                                        user.removeUserList(book);
                                        System.out.println(book.getName() + " => This book deleted in your list.");
                                        System.out.println(user);
                                        int bookCounter = Users.usersBooks.size();
                                        System.out.println("For " + bookCounter + " book you have to pay " + (bookCounter * 15) + "$");
                                        isBookLibrary = true;
                                    }
                                }
                                if (!isBookLibrary) System.out.println(userGiveBack + " isn't in your list.");
                                break;

                        }


                    case "l":
                        System.out.println("LIBRARIAN");
                        System.out.println("Add book: \"A\" delete book: \"D\"");
                        String librarian = scanner.next().toLowerCase();

                        switch (librarian) {
                            case "a":
                                System.out.println("Enter book ID: ");
                                int bookID = scanner.nextInt();
                                System.out.println("Enter book name: ");
                                String bookName = scanner.next();
                                System.out.println("Enter book author: ");
                                String bookAuthor = scanner.next();
                                System.out.println("Enter book category: ");
                                Categories bookCategory = Categories.valueOf(scanner.next().toUpperCase());
                                Books addedBook = new Books(bookID, bookName, bookAuthor, bookCategory);
                                library.addLibraryList(addedBook);
                                System.out.println("Your book added library: " + addedBook);
                                System.out.println("Updated Book List: " + library);
                                break;

                            case "d":
                                System.out.println("Please enter book name for deleting: ");
                                String deletedBook = scanner.next();
                                for (Books book : library.getAllBooks()) {
                                    if (deletedBook.contains(book.getName().toLowerCase())) {
                                        System.out.println(book.getName() + "=> This book deleted in library list.");
                                        library.removeLibraryList(book);
                                        System.out.println("Updated Book List: " + library);
                                        break;
                                    }
                                }
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