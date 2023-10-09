package com.workintech.interfaces;

import com.workintech.enums.Categories;
import com.workintech.library.Books;

import java.util.*;

public interface Actionable {
    default void distributeCategory(Books book) {
        if (book.getCategories().equals(Categories.SCIENCE_FICTION)) {
            scienceCategory.add(book);
        } else if (book.getCategories().equals(Categories.ACTION)) {
            actionCategory.add(book);
        } else {
            adventureCategory.add(book);
        }
    }
    default void deletedInCategory(Books book) {
        if (book.getCategories().equals(Categories.SCIENCE_FICTION)) {
            scienceCategory.remove(book);
        } else if (book.getCategories().equals(Categories.ACTION)) {
            actionCategory.remove(book);
        } else {
            adventureCategory.remove(book);
        }
    }

    List<Books> scienceCategory = new LinkedList<>();
    List<Books> actionCategory = new LinkedList<>();
    List<Books> adventureCategory = new LinkedList<>();
    Map<Integer, Books> allBooks = new TreeMap<>();
    List<Books> usersBooks = new LinkedList<>();

}
