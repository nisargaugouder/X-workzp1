package com.xworkz.inheritence.internal.instagram;

public class Instagram {
    public Instagram() {
        System.out.println("Instagram --parent");
    }

    public void post() {
        System.out.println("Posting a photo --parent");
    }

    public void message() {
        System.out.println("Sending a message --parent");
    }

    public void follow() {
        System.out.println("Following users --parent");
    }

    public void story() {
        System.out.println("Viewing stories --parent");
    }

    public void likes() {
        System.out.println("Liking posts --parent");
    }
}
