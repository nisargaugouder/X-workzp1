package com.xworkz.inheritence.internal.phone;

public class Phone {
    public Phone() {
        System.out.println("Phone --parent");
    }

    public void call() {
        System.out.println("Phone allows calling --parent");
    }

    public void message() {
        System.out.println("Phone sends messages --parent");
    }

    public void camera() {
        System.out.println("Phone has a basic camera --parent");
    }

    public void battery() {
        System.out.println("Phone has long battery life --parent");
    }

    public void internet() {
        System.out.println("Phone supports internet access --parent");
    }
}
