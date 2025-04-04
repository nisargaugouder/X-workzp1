package com.xworkz.inheritence.internal.scissors;

public class Scissors {
    public Scissors() {
        System.out.println("Scissors --parent");
    }

    public void cut() {
        System.out.println("Scissors are used for cutting --parent");
    }

    public void sharp() {
        System.out.println("Scissors have sharp blades --parent");
    }

    public void home() {
        System.out.println("Scissors are used in households --parent");
    }

    public void size() {
        System.out.println("Scissors come in different sizes --parent");
    }

    public void handle() {
        System.out.println("Scissors require proper handling --parent");
    }
}
