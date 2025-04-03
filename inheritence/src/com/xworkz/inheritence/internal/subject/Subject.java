package com.xworkz.inheritence.internal.subject;

public class Subject {
    public Subject() {
        System.out.println("Running non-arg constructor of Subject");
    }
    public void study() {
        System.out.println("Subject requires study");
    }
    public void exam() {
        System.out.println("Subject is tested in exams");
    }
    public void difficulty() {
        System.out.println("Subject can be difficult");
    }
    public void syllabus() {
        System.out.println("Subject has a syllabus");
    }
}
