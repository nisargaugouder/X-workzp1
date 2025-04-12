package com.xworkz.assignment.internal.book;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book() {
        System.out.println("Running no-arg constructor of Book");
        this.title = "The Alchemist";
        this.author = "Paulo Coelho";
        this.pages = 208;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Pages: " + pages;
    }

    @Override
    public int hashCode() {
        System.out.println("HashCode:"+super.hashCode());
        return 654;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Book){
                System.out.println("have ref.will compare..");
                Book book1=this;
                Book book2=(Book) obj;
                if(book1.pages==book2.pages){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
