package com.xworkz.inheritence.internal.document;

public class Document {
    public Document() {
        System.out.println("Running non-arg constructor Document--parent");
    }

    public void store() {
        System.out.println("Document stores data--parent");
    }

    public void edit() {
        System.out.println("Document can be edited--parent");
    }

    public void print() {
        System.out.println("Document can be printed--parent");
    }

    public void format() {
        System.out.println("Document supports multiple formats--parent");
    }

    public void share() {
        System.out.println("Document can be shared--parent");
    }
}
