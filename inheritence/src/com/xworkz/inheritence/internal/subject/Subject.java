package com.xworkz.inheritence.internal.subject;

public class Subject {
    public Subject() {
        System.out.println("Subject --parent");
    }

    public void study() {
        System.out.println("Studying is essential for understanding --parent");
    }

    public void exam() {
        System.out.println("Exams test knowledge --parent");
    }

    public void difficulty() {
        System.out.println("Subjects have different difficulty levels --parent");
    }

    public void syllabus() {
        System.out.println("Each subject has a defined syllabus --parent");
    }

    public void knowledge() {
        System.out.println("Subjects help in gaining knowledge --parent");
    }
}
