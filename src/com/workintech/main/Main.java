package com.workintech.main;

import com.workintech.library.Books;
import com.workintech.library.Categories;
import com.workintech.library.Librarian;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        libraryOrganisation();
    }

    public static void libraryOrganisation() {
        List<Books> sciFicList = new ArrayList<>();
        List<Books> actionList = new ArrayList<>();
        List<Books> adventureList = new ArrayList<>();
        Librarian lib = new Librarian(new Books(12,"Dönüşüm","Franz Kafka", Categories.ACTION));


        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Kütüphaneci iseniz: L // Kullanıcı iseniz: U // Çıkmak için: E");
                String process = scanner.next();
                String kullanici = process.toLowerCase();

            } catch (Exception ex) {
                System.out.println("Invalid process: " + ex.getMessage());
                break;
            }

        }


    }


}