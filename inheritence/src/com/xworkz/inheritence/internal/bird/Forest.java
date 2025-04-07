package com.xworkz.inheritence.internal.bird;

public class Forest {

    public void observe(Bird bird) {
        bird.fly();
        bird.feathers();
        bird.layEggs();
        bird.sound();
        bird.vision();

        if (bird instanceof Eagle) {
            System.out.println("bird is instance of Eagle");
            Eagle eagle = (Eagle) bird;
            eagle.hunt();
        }
    }
}
