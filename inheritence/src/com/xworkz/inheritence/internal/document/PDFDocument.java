package com.xworkz.inheritence.internal.document;

public class PDFDocument extends Document {
    public PDFDocument() {
        super();
        System.out.println("Running non-arg constructor PDFDocument--child");
    }

    @Override
    public void store() {
        System.out.println("PDF stores data securely--child");
    }

    @Override
    public void edit() {
        System.out.println("PDF editing is limited--child");
    }

    @Override
    public void print() {
        System.out.println("PDF can be printed easily--child");
    }

    @Override
    public void format() {
        System.out.println("PDF is a universal format--child");
    }

    @Override
    public void share() {
        System.out.println("PDF can be shared across platforms--child");
    }
}
