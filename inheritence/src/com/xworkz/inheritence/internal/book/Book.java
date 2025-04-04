package com.xworkz.inheritence.internal.book;

public class Book {
    public Book() {
        System.out.println("Running non-arg constructor Book--parent");
    }
    public void read() {
        System.out.println("Book is read--parent");
    }
    public void write() {
        System.out.println("Book is written by an author--parent");
    }
    public void publish() {
        System.out.println("Book is published--parent");
    }
    public void genre() {
        System.out.println("Book has a genre--parent");
    }
    public void pages() {
        System.out.println("Book has pages--parent");
    }
}
