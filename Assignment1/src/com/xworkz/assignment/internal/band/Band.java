package com.xworkz.assignment.internal.band;

public class Band {
    private String name;
    private String genre;
    private int members;

    public Band() {
        System.out.println("Running no-arg constructor of Band");
        this.name = "The Beatles";
        this.genre = "Rock";
        this.members = 4;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Genre: " + genre + ", Members: " + members;
    }
}
