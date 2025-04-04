package com.xworkz.inheritence.internal.doll;

public class BarbieDoll extends Doll {
    public BarbieDoll() {
        super();
        System.out.println("Running non-arg constructor BarbieDoll--child");
    }

    @Override
    public void play() {
        System.out.println("Barbie is fun to play with--child");
    }

    @Override
    public void dress() {
        System.out.println("Barbie has stylish outfits--child");
    }

    @Override
    public void talk() {
        System.out.println("Barbie can talk in different voices--child");
    }

    @Override
    public void move() {
        System.out.println("Barbie can pose and move--child");
    }

    @Override
    public void collect() {
        System.out.println("Barbie dolls are collectibles--child");
    }
}
