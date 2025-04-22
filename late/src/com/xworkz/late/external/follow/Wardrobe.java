package com.xworkz.late.external.follow;

import com.xworkz.late.internal.bottom.Bottom;

public class Wardrobe {
    private Bottom bottom;

    public Wardrobe(Bottom bottom) {
        this.bottom = bottom;
    }

    public void organize() {
        System.out.println("Running organize in Wardrobe");
        if (this.bottom != null) {
            this.bottom.wear();
        } else {
            System.out.println("Error: bottom is null");
        }
    }
}
