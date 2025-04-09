package com.xworkz.assignment.internal.tree;

public class Tree {
    private String species;
    private double height;
    private int age;

    public Tree(String species, double height, int age) {
        this.species = species;
        this.height = height;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "species='" + species + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
