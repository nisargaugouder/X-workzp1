package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.document.Document;
import com.xworkz.inheritence.internal.document.PDFDocument;
import com.xworkz.inheritence.internal.document.Printer;

public class DocumentRunner {
    public static void main(String[] args) {
        Document doc1 = new Document();
        doc1.store();
        doc1.edit();
        doc1.print();
        doc1.format();
        doc1.share();

        System.out.println("-----------");

        Document doc = new PDFDocument();
        doc.store();
        doc.edit();
        doc.print();
        doc.format();
        doc.share();

        System.out.println("-----------");

        PDFDocument pdf = new PDFDocument();
        pdf.store();
        pdf.edit();
        pdf.print();
        pdf.format();
        pdf.share();

        System.out.println("---casting");
        Printer printer = new Printer();
        printer.process(doc);
        printer.process(pdf);
        printer.process(doc1);
    }
}
