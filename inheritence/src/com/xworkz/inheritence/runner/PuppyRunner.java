package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.puppy.Puppy;
import com.xworkz.inheritence.internal.puppy.LabradorPuppy;

public class PuppyRunner {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.playful();
        puppy.training();
        puppy.care();
        puppy.bark();
        puppy.cuddle();

        System.out.println("-----------");

        Puppy puppy2 = new LabradorPuppy();
        puppy2.playful();
        puppy2.training();
        puppy2.care();
        puppy2.bark();
        puppy2.cuddle();

        System.out.println("-----------");

        LabradorPuppy labradorPuppy = new LabradorPuppy();
        labradorPuppy.playful();
        labradorPuppy.training();
        labradorPuppy.care();
        labradorPuppy.bark();
        labradorPuppy.cuddle();
    }
}
