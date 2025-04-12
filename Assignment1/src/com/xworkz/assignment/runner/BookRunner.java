package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.book.Book;

public class BookRunner {
    public static void main(String[] args) {
        Book book=new Book();
        System.out.println(book);
        System.out.println(new Book().hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(book));

        Book book1=new Book();
        book1.setPages(52);
        Book book2=new Book();
        book2.setPages(152);
        boolean same=book1.equals(book2);
        System.out.println("same:"+same);
    }

}
