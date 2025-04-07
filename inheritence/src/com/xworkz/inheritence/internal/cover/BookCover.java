package com.xworkz.inheritence.internal.cover;

public class BookCover extends Cover {

    @Override
    public void protect() {
        System.out.println("Running protect in BookCover");
    }

    @Override
    public void design() {
        System.out.println("Running design in BookCover");
    }

    @Override
    public void grip() {
        System.out.println("Running grip in BookCover");
    }

    @Override
    public void waterproof() {
        System.out.println("Running waterproof in BookCover");
    }

    @Override
    public void enhance() {
        System.out.println("Running enhance in BookCover");
    }

    public void brand() {
        System.out.println("BookCover brand is Classmate");
    }
}
