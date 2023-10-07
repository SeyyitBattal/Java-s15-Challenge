package com.workintech.library;

public class Librarian extends Person implements Actionable {
    private Books books;

    public Librarian(Books books) {
        this.books = books;
    }

    @Override
    public void addBookList() {

    }

    @Override
    public void addUserList() {
// Burası boş kalacak
    }

    @Override
    public void removeBookList() {

    }
}
