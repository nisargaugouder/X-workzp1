package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.puppy.Puppy;
import com.xworkz.inheritence.internal.puppy.LabradorPuppy;

public class PuppyRunner {
    public static void main(String[] args) {
        Puppy puppy = new LabradorPuppy();
        puppy.playful();
        puppy.requiresTraining();
        puppy.needsCare();
        puppy.communicatesWithBarks();
        puppy.lovesToCuddle();

        System.out.println("-----------------");
        LabradorPuppy labradorPuppy = new LabradorPuppy();
        labradorPuppy.playful();
        labradorPuppy.requiresTraining();
        labradorPuppy.needsCare();
        labradorPuppy.communicatesWithBarks();
        labradorPuppy.lovesToCuddle();
    }
}
