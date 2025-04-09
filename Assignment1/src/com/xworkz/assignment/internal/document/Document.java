package com.xworkz.assignment.internal.document;

public class Document {
    private String title;
    private String author;
    private int pages;

    public Document(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }
}
