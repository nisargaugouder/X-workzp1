package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.bird.Bird;

public class BirdRunner {
    public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.println(bird);
        System.out.println(new Bird().hashCode());
        System.out.println("Original hashCode:"+System.identityHashCode(bird));
    }
}
