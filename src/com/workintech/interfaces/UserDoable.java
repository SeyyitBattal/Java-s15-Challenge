package com.workintech.interfaces;

import com.workintech.library.Books;

public interface UserDoable extends Actionable {
    void addUserList(Books book);

    void removeUserList(Books book);
}
