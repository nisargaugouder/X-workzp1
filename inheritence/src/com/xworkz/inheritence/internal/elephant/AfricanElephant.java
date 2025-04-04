package com.xworkz.inheritence.internal.elephant;

public class AfricanElephant extends Elephant {
    public AfricanElephant() {
        super();
        System.out.println("AfricanElephant created --child");
    }

    @Override
    public void eat() {
        System.out.println("AfricanElephant eats leaves and branches --child");
    }

    @Override
    public void drinkWater() {
        System.out.println("AfricanElephant drinks water from rivers --child");
    }

    @Override
    public void trumpet() {
        System.out.println("AfricanElephant makes a deep trumpet sound --child");
    }

    @Override
    public void useTrunk() {
        System.out.println("AfricanElephant uses trunk to pick food --child");
    }

    @Override
    public void walkSlowly() {
        System.out.println("AfricanElephant walks gracefully --child");
    }
}
