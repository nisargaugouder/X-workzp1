package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.slipper.RubberSlipper;
import com.xworkz.application.inheritancetype.slipper.Slipper;

public class SlipperRunner {
    public static void main(String[] args) {
        Slipper slipper = new Slipper();
        RubberSlipper rubber = new RubberSlipper();

        slipper.wear();
        rubber.bend();
        rubber.wear();
    }
}
