package com.workintech.main;

import com.workintech.enums.Categories;
import com.workintech.library.*;

public class Main {
    public static void main(String[] args) {
        Library();
    }

    public static void Library() {
        Books book1 = new Books(12, "Dönüşüm", "Franz Kafka", Categories.SCIENCE_FICTION);
        Books book2 = new Books(13, "Babamı Beklerken", "Clare Vanderpool", Categories.ADVENTURE);
        Books book3 = new Books(76, "Dünyanın ilk günü", "Beyazit Akman", Categories.ADVENTURE);
        Books book4 = new Books(201, "Yarın yokum", "Lee Child", Categories.ACTION);
        Books book5 = new Books(23, "Suç ve ceza", "Dostoyevski", Categories.SCIENCE_FICTION);

        Librarian librarian = new Librarian();
        librarian.addBookList(book1);
        librarian.addBookList(book2);
        librarian.addBookList(book3);
        librarian.addBookList(book4);
        System.out.println("Librarian: " + librarian);

        System.out.println("**************************");
        Users burak = new Users();
        burak.addUserList(book1);
        burak.addUserList(book3);
        System.out.println("Burak: " + burak);


        System.out.println("**************************");
        System.out.println("Science Books: \n" + Users.scienceCategory);
        System.out.println("**************************");
        System.out.println("Adventure Books: \n" + Users.adventureCategory);
        System.out.println("**************************");
        System.out.println("Action Books: \n" + Users.actionCategory);

    }


}