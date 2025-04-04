package com.xworkz.inheritence.internal.plant;

public class Flower extends Plant {
    public Flower() {
        super();
        System.out.println("Flower --child");
    }

    @Override
    public void grow() {
        System.out.println("Flowers grow with beautiful petals --child");
    }

    @Override
    public void photo() {
        System.out.println("Flowers use sunlight for photosynthesis --child");
    }

    @Override
    public void absorb() {
        System.out.println("Flowers absorb water through roots --child");
    }

    @Override
    public void oxygen() {
        System.out.println("Flowers release oxygen --child");
    }

    @Override
    public void reproduce() {
        System.out.println("Flowers reproduce through pollination --child");
    }
}
