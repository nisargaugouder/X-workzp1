package com.xworkz.inheritence.runner.bird;

import com.xworkz.inheritence.internal.bird.Bird;
import com.xworkz.inheritence.internal.bird.Eagle;

public class BirdRunner {
    public static void main(String[] args) {
        System.out.println("---------- Bird ----------");
        Bird bird = new Bird();
        bird.fly();
        bird.feathers();
        bird.layEggs();
        bird.sound();
        bird.vision();

        System.out.println("---------- Eagle ----------");
        Bird eagle = new Eagle();
        eagle.fly();
        eagle.feathers();
        eagle.layEggs();
        eagle.sound();
        eagle.vision();

        System.out.println("---------- Direct Eagle ----------");
        Eagle directEagle = new Eagle();
        directEagle.fly();
        directEagle.feathers();
        directEagle.layEggs();
        directEagle.sound();
        directEagle.vision();
    }
}
