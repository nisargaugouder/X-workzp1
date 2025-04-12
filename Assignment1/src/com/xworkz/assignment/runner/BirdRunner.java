package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.bird.Bird;

public class BirdRunner {
    public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.println(bird);
        System.out.println(new Bird().hashCode());
        System.out.println("Original hashCode:"+System.identityHashCode(bird));

        Bird bird1=new Bird();
        bird1.setColor("sky blue");
        Bird bird2=new Bird();
        bird2.setColor("sky blue");
        boolean same=bird1.equals(bird2);
        System.out.println("same:"+same);
    }
}
