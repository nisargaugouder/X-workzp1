package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.cat.Cat;

public class CatRunner {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.care();
        cat.feedMilk();
        cat.meow();
    }
}
