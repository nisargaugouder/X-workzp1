package com.xworkz.assignment.internal.subject;

public class Subject {
    private String name;
    private int marks;
    private String teacher;

    public Subject(String name, int marks, String teacher) {
        this.name = name;
        this.marks = marks;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
