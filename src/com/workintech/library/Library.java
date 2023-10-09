package com.workintech.library;

import com.workintech.enums.Categories;
import com.workintech.interfaces.Actionable;

public class Library implements Actionable {

    @Override
    public void addBookList(Books book) {
        allBooks.put(book.getId(), book);
        if (book.getCategories().equals(Categories.SCIENCE_FICTION)) {
            scienceCategory.add(book);
        } else if (book.getCategories().equals(Categories.ACTION)) {
            actionCategory.add(book);
        } else {
            adventureCategory.add(book);
        }
    }

    @Override
    public void removeBookList(Books book) {
        allBooks.remove(book.getId(), book);
        if (book.getCategories().equals(Categories.SCIENCE_FICTION)) {
            scienceCategory.remove(book);
        } else if (book.getCategories().equals(Categories.ACTION)) {
            actionCategory.remove(book);
        } else {
            adventureCategory.remove(book);
        }
    }

    @Override
    public void addUserList(Books book) {
        if (usersBooks.size() >= 5) {
            System.out.println("You can take max 5 books.");
        } else {
            allBooks.remove(book.getId(), book);
            usersBooks.add(book);
            if (book.getCategories().equals(Categories.SCIENCE_FICTION)) {
                scienceCategory.remove(book);
            } else if (book.getCategories().equals(Categories.ACTION)) {
                actionCategory.remove(book);
            } else {
                adventureCategory.remove(book);
            }
        }
    }

    @Override
    public void removeUserList(Books book) {
        allBooks.put(book.getId(), book);
        usersBooks.remove(book);
        if (book.getCategories().equals(Categories.SCIENCE_FICTION)) {
            scienceCategory.add(book);
        } else if (book.getCategories().equals(Categories.ACTION)) {
            actionCategory.add(book);
        } else {
            adventureCategory.add(book);
        }
    }

    public void listAllBooks() {
        System.out.println("____________________________");
        for (Books book : allBooks.values()) {
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
