package com.xworkz.late.external.follow;

import com.xworkz.late.internal.flower.Flower;

public class Garden {
    private Flower flower;

    public Garden(Flower flower) {
        this.flower = flower;
    }

    public void fragrance() {
        System.out.println("Running fragrance in Garden");
        if (this.flower != null) {
            this.flower.smell();
        } else {
            System.out.println("error");
        }
    }
}
