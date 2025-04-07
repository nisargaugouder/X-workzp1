package com.xworkz.inheritence.internal.doll;

public class BarbieDoll extends Doll {

    @Override
    public void play() {
        System.out.println("Running play in BarbieDoll");
    }

    @Override
    public void dress() {
        System.out.println("Running dress in BarbieDoll");
    }

    @Override
    public void talk() {
        System.out.println("Running talk in BarbieDoll");
    }

    @Override
    public void move() {
        System.out.println("Running move in BarbieDoll");
    }

    @Override
    public void collect() {
        System.out.println("Running collect in BarbieDoll");
    }

    public void hairstyle() {
        System.out.println("BarbieDoll has different hairstyles");
    }
}
