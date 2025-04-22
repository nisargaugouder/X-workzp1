package com.xworkz.late.external.follow;

import com.xworkz.late.internal.cat.Cat;

public class Home {
    private Cat cat;

    public Home(Cat cat) {
        this.cat = cat;
    }

    public void cuddle() {
        System.out.println("running cuddle in Home");
        if (this.cat != null) {
            this.cat.meow();
        } else {
            System.out.println("error");
        }
    }
}
