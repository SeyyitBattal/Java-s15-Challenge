package com.workintech.library;

import com.workintech.interfaces.AdminDoable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library implements AdminDoable {

    @Override
    public void addLibraryList(Books book) {
        allBooks.put(book.getId(), book);
        distributeCategory(book);
    }

    @Override
    public void removeLibraryList(Books book) {
        allBooks.remove(book.getId(), book);
        deletedInCategory(book);
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

    public List<Books> getAllBooks() {
        return new ArrayList<>(allBooks.values());
    }

    @Override
    public String toString() {
        return "All books: " + allBooks;
    }


}
