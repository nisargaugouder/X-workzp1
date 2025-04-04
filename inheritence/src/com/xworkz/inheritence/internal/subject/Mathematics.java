package com.xworkz.inheritence.internal.subject;

public class Mathematics extends Subject {
    public Mathematics() {
        super();
        System.out.println("Mathematics --child");
    }

    @Override
    public void study() {
        System.out.println("Mathematics requires practice --child");
    }

    @Override
    public void exam() {
        System.out.println("Math exams include problem-solving --child");
    }

    @Override
    public void difficulty() {
        System.out.println("Mathematics is challenging for many students --child");
    }

    @Override
    public void syllabus() {
        System.out.println("Mathematics syllabus includes algebra, calculus, and geometry --child");
    }

    @Override
    public void knowledge() {
        System.out.println("Mathematics enhances logical thinking --child");
    }
}
