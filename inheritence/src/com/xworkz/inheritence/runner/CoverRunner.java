package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.cover.Cover;
import com.xworkz.inheritence.internal.cover.BookCover;

public class CoverRunner {
    public static void main(String[] args) {
        Cover cover = new BookCover();
        cover.protect();
        cover.design();
        cover.provideGrip();
        cover.waterproof();
        cover.enhanceLook();

        System.out.println("-----------------");
        BookCover bookCover = new BookCover();
        bookCover.protect();
        bookCover.design();
        bookCover.provideGrip();
        bookCover.waterproof();
        bookCover.enhanceLook();
    }
}
