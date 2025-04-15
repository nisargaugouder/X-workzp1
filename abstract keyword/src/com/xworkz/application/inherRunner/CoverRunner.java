package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.cover.BookCover;
import com.xworkz.application.inheritancetype.cover.PhoneCover;

public class CoverRunner {
    public static void main(String[] args) {
        BookCover bookCover = new BookCover();
        bookCover.designCover();
        bookCover.protect();

        PhoneCover phoneCover = new PhoneCover();
        phoneCover.shieldPhone();
        phoneCover.protect();
    }
}
