package com.xworkz.inheritence.internal.flower;

public class Rose extends Flower {
    public Rose() {
        super();
        System.out.println("Rose -- child");
    }

    @Override
    public void bloom() {
        System.out.println("Blooming -- child");
    }

    @Override
    public void scent() {
        System.out.println("Has fragrance -- child");
    }

    @Override
    public void shade() {
        System.out.println("Has color -- child");
    }

    @Override
    public void petals() {
        System.out.println("Has petals -- child");
    }

    @Override
    public void pollinate() {
        System.out.println("Pollination occurs -- child");
    }

    public void red(){
        System.out.println("new method red in child class");
    }
}
