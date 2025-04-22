package com.xworkz.late.external.follow;

import com.xworkz.late.internal.black.Black;

public class Paint {
    private Black black;

    public Paint(Black black) {
        this.black = black;
    }

    public void apply() {
        System.out.println("Running apply in Paint");
        if (this.black != null) {
            this.black.dark();
        } else {
            System.out.println("Error: black is null");
        }
    }
}
