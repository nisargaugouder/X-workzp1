package com.xworkz.inheritence.internal.university;

public class Harvard extends University {
    public Harvard() {
        super();
        System.out.println("Harvard --child");
    }

    @Override
    public void education() {
        System.out.println("Harvard provides world-class education --child");
    }

    @Override
    public void research() {
        System.out.println("Harvard leads in research --child");
    }

    @Override
    public void students() {
        System.out.println("Harvard has talented students --child");
    }

    @Override
    public void faculty() {
        System.out.println("Harvard has expert faculty --child");
    }

    @Override
    public void campus() {
        System.out.println("Harvard has a historic campus --child");
    }
}
