package com.xworkz.inheritence.internal.cover;

public class BookCover extends Cover {
    public BookCover() {
        super();
        System.out.println("Running non-arg constructor BookCover--child");
    }

    @Override
    public void protect() {
        System.out.println("Book covers protect pages--child");
    }

    @Override
    public void design() {
        System.out.println("Book covers have attractive designs--child");
    }

    @Override
    public void grip() {
        System.out.println("Book covers provide a good grip--child");
    }

    @Override
    public void waterproof() {
        System.out.println("Book covers can be waterproof--child");
    }

    @Override
    public void enhance() {
        System.out.println("Book covers enhance book's look--child");
    }
}
