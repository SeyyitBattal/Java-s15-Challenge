package com.workintech.library;

public class Person implements Actionable{

    @Override
    public void addBookList(Books book) {
        if (book.getCategories().equals(Categories.SCIENCE_FICTION)) {
            scienceCategory.add(book);

        } else if (book.getCategories().equals(Categories.ACTION)) {
            actionCategory.add(book);
        }else{
            adventureCategory.add(book);
        }
    }

    @Override
    public void removeBookList(Books book) {

    }

    @Override
    public void addUserList(Books book) {

    }

    @Override
    public void removeUserList(Books book) {

    }
}
