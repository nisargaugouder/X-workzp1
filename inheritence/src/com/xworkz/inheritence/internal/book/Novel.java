package com.xworkz.inheritence.internal.book;

public class Novel extends Book {

    public Novel() {
        super();
        System.out.println("Running no-arg constructor Novel");
    }

    @Override
    public void read() {
        System.out.println("Reading an interesting novel--child");
    }

    @Override
    public void write() {
        System.out.println("Writing a story in the novel--child");
    }

    @Override
    public void publish() {
        System.out.println("Publishing the novel--child");
    }

    @Override
    public void genre() {
        System.out.println("Novel belongs to fiction or non-fiction genre--child");
    }

    @Override
    public void pages() {
        System.out.println("Novel has 300+ pages--child");
    }

    public void story() {
        System.out.println("New method story in child class Novel");
    }
}
