package com.xworkz.assignment.internal.book;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book() {
        System.out.println("Running no-arg constructor of Book");
        this.title = "The Alchemist";
        this.author = "Paulo Coelho";
        this.pages = 208;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Pages: " + pages;
    }
}
