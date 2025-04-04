package com.xworkz.inheritence.internal.photo;

public class DigitalPhoto extends Photo {
    public DigitalPhoto() {
        super();
        System.out.println("DigitalPhoto --child");
    }

    @Override
    public void capture() {
        System.out.println("DigitalPhoto captures in high resolution --child");
    }

    @Override
    public void store() {
        System.out.println("DigitalPhoto is stored in cloud storage --child");
    }

    @Override
    public void print() {
        System.out.println("DigitalPhoto can be printed with high clarity --child");
    }

    @Override
    public void format() {
        System.out.println("DigitalPhoto supports JPEG, PNG formats --child");
    }

    @Override
    public void share() {
        System.out.println("DigitalPhoto is shared instantly online --child");
    }
}
