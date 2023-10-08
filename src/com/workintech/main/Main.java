package com.workintech.main;

import com.workintech.enums.Categories;
import com.workintech.library.*;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LibraryOrganisation();
    }

    public static void LibraryOrganisation() {
        Books book1 = new Books(12, "Dönüşüm", "Franz Kafka", Categories.SCIENCE_FICTION);
        Books book2 = new Books(13, "Babamı Beklerken", "Clare Vanderpool", Categories.ADVENTURE);
        Books book3 = new Books(76, "Dünyanın ilk günü", "Beyazit Akman", Categories.ADVENTURE);
        Books book4 = new Books(201, "Yarın yokum", "Lee Child", Categories.ACTION);
        Books book5 = new Books(23, "Suç ve ceza", "Dostoyevski", Categories.SCIENCE_FICTION);

        Library library = new Library();
        library.addBookList(book1);
        library.addBookList(book2);
        library.addBookList(book3);
        library.addBookList(book4);
        library.addBookList(book5);
        System.out.println("Library: " + library);
        System.out.println("*************************");

        Users Battal = new Users();
        Battal.addUserList(book1);
        Battal.addUserList(book1);
        Battal.addUserList(book2);
        Battal.addUserList(book3);
        Battal.addUserList(book3);
        Battal.addUserList(book5);
        System.out.println("BATTAL"+ Battal);

        System.out.println("**************************");
        System.out.println("Science Books: \n" + Users.scienceCategory);
        System.out.println("***");
        System.out.println("Adventure Books: \n" + Users.adventureCategory);
        System.out.println("***");
        System.out.println("Action Books: \n" + Users.actionCategory);

    }


}