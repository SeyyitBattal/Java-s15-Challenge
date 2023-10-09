package com.workintech.interfaces;

import com.workintech.library.Books;

public interface AdminDoable extends Actionable {
    void addBookList(Books book);

    void removeBookList(Books book);



}
