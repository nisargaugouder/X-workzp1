package com.xworkz.late.external.follow;

import com.xworkz.late.internal.duck.Duck;

public class Lake {
    private Duck duck;

    public Lake(Duck duck) {
        this.duck = duck;
    }

    public void swim() {
        System.out.println("running swim in Lake");
        if (this.duck != null) {
            this.duck.quack();
        } else {
            System.out.println("error");
        }
    }
}
