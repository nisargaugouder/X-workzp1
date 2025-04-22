package com.xworkz.late.external.follow;

import com.xworkz.late.internal.carrot.Carrot;

public class Market {
    private Carrot carrot;

    public Market(Carrot carrot) {
        this.carrot = carrot;
    }

    public void sell() {
        System.out.println("running sell in Market");
        if (this.carrot != null) {
            this.carrot.eat();
        } else {
            System.out.println("error");
        }
    }
}
