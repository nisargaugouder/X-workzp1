package com.xworkz.inheritence.internal.elephant;

public class AfricanElephant extends Elephant {
    public AfricanElephant() {
        super();
        System.out.println("Running non-arg constructor AfricanElephant--child");
    }

    @Override
    public void eat() {
        System.out.println("African Elephant eats grass and plants--child");
    }

    @Override
    public void drinkWater() {
        System.out.println("African Elephant drinks a lot of water--child");
    }

    @Override
    public void trumpet() {
        System.out.println("African Elephant makes trumpet sound--child");
    }

    @Override
    public void useTrunk() {
        System.out.println("African Elephant uses trunk for many activities--child");
    }

    @Override
    public void walkSlowly() {
        System.out.println("African Elephant walks slowly due to heavy body--child");
    }

    public void tusks() {
        System.out.println("New method tusks in child class");
    }
}
