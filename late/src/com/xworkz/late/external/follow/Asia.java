package com.xworkz.late.external.follow;

import com.xworkz.late.internal.japan.Japan;

public class Asia {
    private Japan japan;

    public Asia(Japan japan) {
        this.japan = japan;
    }

    public void showTech() {
        System.out.println("Running showTech in Asia");
        if (this.japan != null) {
            this.japan.innovate();
        } else {
            System.out.println("error");
        }
    }
}
