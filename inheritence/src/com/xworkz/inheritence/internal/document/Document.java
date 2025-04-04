package com.xworkz.inheritence.internal.document;

public class Document {
    public Document() {
        System.out.println("Running non-arg constructor Document");
    }
    public void storeData() {
        System.out.println("Documents store important data");
    }
    public void canBeEdited() {
        System.out.println("Documents can be edited and updated");
    }
    public void canBePrinted() {
        System.out.println("Documents can be printed for official use");
    }
    public void supportMultipleFormats() {
        System.out.println("Documents support multiple formats like DOCX, PDF, TXT");
    }
    public void shareInformation() {
        System.out.println("Documents are used to share information efficiently");
    }
}
