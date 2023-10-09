package com.workintech.library;

import com.workintech.enums.Categories;
import com.workintech.interfaces.Actionable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library implements Actionable {

    public void distributeCategory(Books book) {
        if (book.getCategories().equals(Categories.SCIENCE_FICTION)) {
            scienceCategory.add(book);
        } else if (book.getCategories().equals(Categories.ACTION)) {
            actionCategory.add(book);
        } else {
            adventureCategory.add(book);
        }
    }

    public void deletedInCategory(Books book) {
        if (book.getCategories().equals(Categories.SCIENCE_FICTION)) {
            scienceCategory.remove(book);
        } else if (book.getCategories().equals(Categories.ACTION)) {
            actionCategory.remove(book);
        } else {
            adventureCategory.remove(book);
        }
    }

    @Override
    public void addBookList(Books book) {
        allBooks.put(book.getId(), book);
        distributeCategory(book);
    }

    @Override
    public void removeBookList(Books book) {
        allBooks.remove(book.getId(), book);
        deletedInCategory(book);
    }

    @Override
    public void addUserList(Books book) {
        if (usersBooks.size() >= 5) {
            System.out.println("You can take max 5 books.");
        } else {
            if (usersBooks.contains(book)) {
                System.out.println(book.getName() + " => this book in your list");
            } else {
                allBooks.remove(book.getId(), book);
                usersBooks.add(book);
                deletedInCategory(book);
            }

        }
    }

    @Override
    public void removeUserList(Books book) {
        allBooks.put(book.getId(), book);
        usersBooks.remove(book);
        distributeCategory(book);
    }

    public void listAllBooks() {
        List<Books> sortedBooks = new ArrayList<>(allBooks.values());
        sortedBooks.sort(Comparator.comparing(Books::getName));
        System.out.println("____________________________");
        for (Books book : sortedBooks) {
            System.out.println("____________________________");
            System.out.println("ID Number: " + book.getId());
            System.out.println("Name: " + book.getName());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Category: " + book.getCategories());
            System.out.println("____________________________");
        }
        System.out.println("____________________________");
    }


    @Override
    public String toString() {
        return "All books: " + allBooks;
    }


}
