package com.xworkz.late.external.follow;

import com.xworkz.late.internal.book.Pages;

public class Book {
    private Pages pages;

    public Book(Pages pages) {
        this.pages = pages;
    }

    public void read() {
        System.out.println("Reading a book...");
        if (this.pages!=null){
            this.pages.turn();
        }
        else {
            System.out.println("err");
        }
    }
}
