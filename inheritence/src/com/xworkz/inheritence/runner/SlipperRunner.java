package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.slipper.Slipper;
import com.xworkz.inheritence.internal.slipper.FlipFlop;

public class SlipperRunner {
    public static void main(String[] args) {
        Slipper slipper = new Slipper();
        slipper.wear();
        slipper.walk();
        slipper.grip();
        slipper.comfort();
        slipper.relax();

        System.out.println("-----------");

        Slipper slipper2 = new FlipFlop();
        slipper2.wear();
        slipper2.walk();
        slipper2.grip();
        slipper2.comfort();
        slipper2.relax();

        System.out.println("-----------");

        FlipFlop flipFlop = new FlipFlop();
        flipFlop.wear();
        flipFlop.walk();
        flipFlop.grip();
        flipFlop.comfort();
        flipFlop.relax();
    }
}
