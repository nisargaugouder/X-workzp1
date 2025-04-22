package com.xworkz.late.external.follow;
import com.xworkz.late.internal.body.Muscle;

public class Arm {
    private Muscle muscle;

    public Arm(Muscle muscle) {
        this.muscle = muscle;
    }

    public void lift() {
        System.out.println("Lifting arm");
        if (this.muscle!=null){
            this.muscle.move();
        }
        else {
            System.out.println("er");
        }
    }
}
