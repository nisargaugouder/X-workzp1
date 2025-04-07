package com.xworkz.inheritence.internal.book;

public class Library {

    public void display(Book book) {
        book.read();
        book.write();
        book.publish();
        book.genre();
        book.pages();

        if (book instanceof Novel) {
            System.out.println("book instance of Novel");
            Novel novel = (Novel) book;
            novel.story();
        }
    }
}
