package com.workintech.library;

import java.util.Objects;

public class Books implements Readable {

    private int id;
    private String name;
    private double price;
    private Category category;

    public Books(int id, String name, Category category) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = 20;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Books books = (Books) object;
        return id == books.id && Objects.equals(name, books.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }

}
