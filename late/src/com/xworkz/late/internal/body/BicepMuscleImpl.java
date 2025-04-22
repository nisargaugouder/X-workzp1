package com.xworkz.late.internal.body;

public class BicepMuscleImpl implements Muscle {
    public BicepMuscleImpl(){
        System.out.println("no arg cons of BicepMuscleImpl");
    }

    @Override
    public void move() {
        System.out.println("Flexing bicep muscle");
    }
}
