package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.document.Document;

public class DocumentRunner {
    public static void main(String[] args) {
        Document document = new Document("Java Basics", "John Doe", 120);
        System.out.println(document);
        System.out.println(document.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(document));

        Document document1 = new Document("Python Basics", "Jane Doe", 100);
        Document document2 = new Document("Python Basics", "Jane Doe", 100);

        boolean same = document1.equals(document2);
        System.out.println("same:" + same);
    }
}
