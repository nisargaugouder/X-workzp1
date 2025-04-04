package com.xworkz.inheritence.internal.puppy;

public class LabradorPuppy extends Puppy {
    public LabradorPuppy() {
        super();
        System.out.println("LabradorPuppy --child");
    }

    @Override
    public void playful() {
        System.out.println("Labrador puppies are extra playful --child");
    }

    @Override
    public void training() {
        System.out.println("Labrador puppies need obedience training --child");
    }

    @Override
    public void care() {
        System.out.println("Labrador puppies require regular exercise --child");
    }

    @Override
    public void bark() {
        System.out.println("Labrador puppies bark loudly --child");
    }

    @Override
    public void cuddle() {
        System.out.println("Labrador puppies love to cuddle a lot --child");
    }
}
