package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.document.Document;

public class DocumentRunner {
    public static void main(String[] args) {
        Document document = new Document("Java Basics", "John Doe", 120);
        System.out.println(document);
    }
}
