package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.document.Document;
import com.xworkz.inheritence.internal.document.PDFDocument;

public class DocumentRunner {
    public static void main(String[] args) {
        Document document = new PDFDocument();
        document.storeData();
        document.canBeEdited();
        document.canBePrinted();
        document.supportMultipleFormats();
        document.shareInformation();

        System.out.println("-----------------");
        PDFDocument pdfDocument = new PDFDocument();
        pdfDocument.storeData();
        pdfDocument.canBeEdited();
        pdfDocument.canBePrinted();
        pdfDocument.supportMultipleFormats();
        pdfDocument.shareInformation();
    }
}
