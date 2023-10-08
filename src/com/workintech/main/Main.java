package com.workintech.main;

import com.workintech.library.*;

import java.util.Scanner;

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

        Users user = new Users();
        user.addBookList(book1);
        user.addBookList(book1);
        user.addBookList(book2);
        user.addBookList(book3);

        System.out.println(Users.scienceCategory);
        System.out.println("**************************");
        System.out.println(Users.adventureCategory);


    }


}