package com.xworkz.inheritence.internal.suitcase;

public class Zip extends Suitcase {
    public Zip() {
        super();
        System.out.println("Zip --child");
    }

    @Override
    public void open() {
        System.out.println("Zip Suitcase can be opened smoothly --child");
    }

    @Override
    public void close() {
        System.out.println("Zip Suitcase can be closed securely --child");
    }

    @Override
    public void color() {
        System.out.println("Zip Suitcase is available in vibrant colors --child");
    }

    @Override
    public void size() {
        System.out.println("Zip Suitcase comes in compact sizes --child");
    }

    @Override
    public void lock() {
        System.out.println("Zip Suitcase has a zip-lock mechanism --child");
    }
}
