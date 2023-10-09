package com.workintech.interfaces;

import com.workintech.library.Books;

import java.util.*;

public interface Actionable {
    //TODO: Booklist ve Userlist farklı interfacelerde olmalı
     void addBookList(Books book);

    void removeBookList(Books book);

    void addUserList(Books book);

    void removeUserList(Books book);

    List<Books> scienceCategory = new LinkedList<>();
    List<Books> actionCategory = new LinkedList<>();
    List<Books> adventureCategory = new LinkedList<>();
    Map<Integer, Books> allBooks = new TreeMap<>();
    List<Books> usersBooks = new LinkedList<>();

}
