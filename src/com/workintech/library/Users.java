package com.workintech.library;

import com.workintech.interfaces.UserDoable;

public class Users implements UserDoable {
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

    @Override
    public String toString() {
        return "Kitaplarım : " + usersBooks;
    }

}
