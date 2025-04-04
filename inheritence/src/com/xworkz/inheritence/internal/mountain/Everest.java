package com.xworkz.inheritence.internal.mountain;

public class Everest extends Mountain {
    public Everest() {
        super();
        System.out.println("Everest --child");
    }

    @Override
    public void height() {
        System.out.println("Everest is the tallest mountain --child");
    }

    @Override
    public void climate() {
        System.out.println("Everest has extreme cold climate --child");
    }

    @Override
    public void location() {
        System.out.println("Everest is located in the Himalayas --child");
    }

    @Override
    public void trekking() {
        System.out.println("Everest is famous for trekking expeditions --child");
    }

    @Override
    public void wildlife() {
        System.out.println("Everest has unique wildlife like snow leopards --child");
    }
}
