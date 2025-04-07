package com.xworkz.inheritence.internal.cover;

public class BookStore {

    public void sell(Cover cover) {
        cover.protect();
        cover.design();
        cover.grip();
        cover.waterproof();
        cover.enhance();

        if (cover instanceof BookCover) {
            System.out.println("cover instanceof BookCover");
            BookCover bookCover = (BookCover) cover;
            bookCover.brand();
        }
    }
}
