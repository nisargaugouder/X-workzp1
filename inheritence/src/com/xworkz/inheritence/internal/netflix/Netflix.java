package com.xworkz.inheritence.internal.netflix;

public class Netflix {
    public Netflix() {
        System.out.println("Netflix --parent");
    }

    public void stream() {
        System.out.println("Netflix allows streaming shows --parent");
    }

    public void subscribe() {
        System.out.println("Netflix offers subscription plans --parent");
    }

    public void devices() {
        System.out.println("Netflix supports multiple devices --parent");
    }

    public void content() {
        System.out.println("Netflix provides original content --parent");
    }

    public void offline() {
        System.out.println("Netflix allows offline viewing --parent");
    }
}
