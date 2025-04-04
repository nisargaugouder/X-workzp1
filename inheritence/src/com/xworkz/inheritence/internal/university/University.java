package com.xworkz.inheritence.internal.university;

public class University {
    public University() {
        System.out.println("University --parent");
    }

    public void education() {
        System.out.println("University provides education --parent");
    }

    public void research() {
        System.out.println("University conducts research --parent");
    }

    public void students() {
        System.out.println("University has students --parent");
    }

    public void faculty() {
        System.out.println("University has faculty --parent");
    }

    public void campus() {
        System.out.println("University has a campus --parent");
    }
}
