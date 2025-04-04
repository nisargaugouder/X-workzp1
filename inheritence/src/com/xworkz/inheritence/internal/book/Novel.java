package com.xworkz.inheritence.internal.book;

public class Novel extends Book {
    public Novel() {
        super();
        System.out.println("Running non-arg constructor Novel");
    }
    @Override
    public void read() {
        System.out.println("Novel is read for entertainment--child");
    }
    @Override
    public void write() {
        System.out.println("Novel is written with detailed storytelling--child");
    }
    @Override
    public void publish() {
        System.out.println("Novel is published by major publishers--child");
    }
    @Override
    public void genre() {
        System.out.println("Novel comes in different genres like fiction and mystery--child");
    }
    @Override
    public void pages() {
        System.out.println("Novel usually has more pages than other books--child");
    }
}
