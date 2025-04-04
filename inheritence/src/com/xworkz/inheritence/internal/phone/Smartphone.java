package com.xworkz.inheritence.internal.phone;

public class Smartphone extends Phone {
    public Smartphone() {
        super();
        System.out.println("Smartphone --child");
    }

    @Override
    public void call() {
        System.out.println("Smartphone supports video calls --child");
    }

    @Override
    public void message() {
        System.out.println("Smartphone allows instant messaging --child");
    }

    @Override
    public void camera() {
        System.out.println("Smartphone has a high-resolution camera --child");
    }

    @Override
    public void battery() {
        System.out.println("Smartphone supports fast charging --child");
    }

    @Override
    public void internet() {
        System.out.println("Smartphone has 5G connectivity --child");
    }
}
