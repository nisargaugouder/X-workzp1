package com.xworkz.inheritence.runner.book;

import com.xworkz.inheritence.internal.book.Book;
import com.xworkz.inheritence.internal.book.Novel;

public class BookRunner {
    public static void main(String[] args) {
        System.out.println("---------- Book ----------");
        Book book = new Book();
        book.read();
        book.write();
        book.publish();
        book.genre();
        book.pages();

        System.out.println("---------- Novel ----------");
        Book novel = new Novel();
        novel.read();
        novel.write();
        novel.publish();
        novel.genre();
        novel.pages();

        System.out.println("---------- Direct Novel ----------");
        Novel directNovel = new Novel();
        directNovel.read();
        directNovel.write();
        directNovel.publish();
        directNovel.genre();
        directNovel.pages();
    }
}
