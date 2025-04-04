package com.xworkz.inheritence.internal.sports;

public class Sports {
    public Sports() {
        System.out.println("Sports --parent");
    }

    public void play() {
        System.out.println("Sports involve playing --parent");
    }

    public void rules() {
        System.out.println("Sports have rules --parent");
    }

    public void competition() {
        System.out.println("Sports have competitions --parent");
    }

    public void team() {
        System.out.println("Some sports require a team --parent");
    }

    public void training() {
        System.out.println("Sports require training --parent");
    }
}
