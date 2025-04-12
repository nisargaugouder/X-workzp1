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

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public int hashCode() {
        System.out.println("DocumentHashCode:"+super.hashCode());
        return 1953;
    }
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Document){
                System.out.println("have ref.will compare..");
                Document document1=this;
                Document document2=(Document) obj;
                if(document1.author.equals(document2.author) && document1.pages==document2.pages){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
