package com.xworkz.inheritence.internal.document;

public class Printer {

    public void process(Document document) {
        document.store();
        document.edit();
        document.print();
        document.format();
        document.share();

        if(document instanceof PDFDocument) {
            System.out.println("document instanceof PDFDocument");
            PDFDocument pdf = (PDFDocument) document;
            pdf.security();
        }
    }
}
