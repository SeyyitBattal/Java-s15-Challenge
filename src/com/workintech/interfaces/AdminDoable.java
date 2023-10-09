package com.workintech.interfaces;

import com.workintech.library.Books;

public interface AdminDoable extends Actionable {
    void addLibraryList(Books book);

    void removeLibraryList(Books book);



}
