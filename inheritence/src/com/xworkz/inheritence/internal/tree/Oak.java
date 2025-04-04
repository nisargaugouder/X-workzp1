package com.xworkz.inheritence.internal.tree;

public class Oak extends Tree {
    public Oak() {
        super();
        System.out.println("Oak --child");
    }

    @Override
    public void roots() {
        System.out.println("Oak has strong roots --child");
    }

    @Override
    public void branches() {
        System.out.println("Oak has thick branches --child");
    }

    @Override
    public void leaves() {
        System.out.println("Oak has lobed leaves --child");
    }

    @Override
    public void oxygen() {
        System.out.println("Oak releases fresh oxygen --child");
    }

    @Override
    public void lifespan() {
        System.out.println("Oak lives for centuries --child");
    }
}
