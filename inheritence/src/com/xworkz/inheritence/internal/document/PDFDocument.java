package com.xworkz.inheritence.internal.document;

public class PDFDocument extends Document {

    @Override
    public void store() {
        System.out.println("Running store in PDFDocument");
    }

    @Override
    public void edit() {
        System.out.println("Running edit in PDFDocument");
    }

    @Override
    public void print() {
        System.out.println("Running print in PDFDocument");
    }

    @Override
    public void format() {
        System.out.println("Running format in PDFDocument");
    }

    @Override
    public void share() {
        System.out.println("Running share in PDFDocument");
    }

    public void security() {
        System.out.println("PDFDocument has password protection feature");
    }
}
