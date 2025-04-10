package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.book.Book;

public class BookRunner {
    public static void main(String[] args) {
        Book book=new Book();
        System.out.println(book);
        System.out.println(new Book().hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(book));
    }

}
