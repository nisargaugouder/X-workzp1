package com.xworkz.inheritence.internal.party;

public class Party {
    public Party() {
        System.out.println("Party --parent");
    }

    public void invite() {
        System.out.println("Party invites people --parent");
    }

    public void food() {
        System.out.println("Party serves delicious food --parent");
    }

    public void music() {
        System.out.println("Party plays music for enjoyment --parent");
    }

    public void dance() {
        System.out.println("People dance at the party --parent");
    }

    public void decorate() {
        System.out.println("Party venue is decorated beautifully --parent");
    }
}
