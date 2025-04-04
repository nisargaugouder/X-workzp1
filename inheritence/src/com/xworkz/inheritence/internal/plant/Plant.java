package com.xworkz.inheritence.internal.plant;

public class Plant {
    public Plant() {
        System.out.println("Plant --parent");
    }

    public void grow() {
        System.out.println("Plants grow using sunlight --parent");
    }

    public void photo() {
        System.out.println("Plants perform photosynthesis --parent");
    }

    public void absorb() {
        System.out.println("Plants absorb water from soil --parent");
    }

    public void oxygen() {
        System.out.println("Plants provide oxygen --parent");
    }

    public void reproduce() {
        System.out.println("Plants reproduce through seeds --parent");
    }
}
