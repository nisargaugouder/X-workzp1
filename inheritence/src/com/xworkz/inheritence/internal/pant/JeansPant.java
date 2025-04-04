package com.xworkz.inheritence.internal.pant;

public class JeansPant extends Pant {
    public JeansPant() {
        super();
        System.out.println("JeansPant --child");
    }

    @Override
    public void wear() {
        System.out.println("JeansPant is stylish and durable --child");
    }

    @Override
    public void fabric() {
        System.out.println("JeansPant is made of denim fabric --child");
    }

    @Override
    public void style() {
        System.out.println("JeansPant comes in skinny and relaxed styles --child");
    }

    @Override
    public void comfort() {
        System.out.println("JeansPant offers comfort with stretchability --child");
    }

    @Override
    public void size() {
        System.out.println("JeansPant is available in multiple sizes --child");
    }
}
