package com.workintech.library;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public interface Actionable {
    void addBookList(Books book);
    void removeBookList(Books book);
    void addUserList(Books book);
    void removeUserList(Books book);

    List<Books> scienceCategory = new LinkedList<>();
    List<Books> actionCategory = new LinkedList<>();
    List<Books> adventureCategory = new LinkedList<>();

}
