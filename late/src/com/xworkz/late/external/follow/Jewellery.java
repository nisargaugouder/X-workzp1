package com.xworkz.late.external.follow;

import com.xworkz.late.internal.gold.Gold;

public class Jewellery {
    private Gold gold;

    public Jewellery(Gold gold) {
        this.gold = gold;
    }

    public void display() {
        System.out.println("Running display in Jewellery");
        if (this.gold != null) {
            this.gold.shine();
        } else {
            System.out.println("error");
        }
    }
}
