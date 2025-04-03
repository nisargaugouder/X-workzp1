package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.slipper.Slipper;
import com.xworkz.inheritence.internal.slipper.FlipFlop;

public class SlipperRunner {
    public static void main(String[] args) {
        Slipper slipper = new FlipFlop();
        slipper.wear();
        slipper.walk();
        slipper.grip();
        slipper.comfort();

        System.out.println("-----------------");
        FlipFlop flipFlop = new FlipFlop();
        flipFlop.wear();
        flipFlop.walk();
        flipFlop.grip();
        flipFlop.comfort();
    }
}
