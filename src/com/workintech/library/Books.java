package com.workintech.library;

import java.util.Objects;

public class Books {
    private int id;
    private String name;
    private String author;
    private Categories categories;

    public Books(int id, String name, String author, Categories categories) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.categories = categories;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Categories getCategories() {
        return categories;
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
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", categories=" + categories +
                '}';
    }
}
