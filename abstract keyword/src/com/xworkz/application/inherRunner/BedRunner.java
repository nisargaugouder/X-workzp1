package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.bed.SingleBed;
import com.xworkz.application.inheritancetype.bed.DoubleBed;

public class BedRunner {
    public static void main(String[] args) {
        SingleBed single = new SingleBed();
        single.compact();
        single.sleepOn();

        DoubleBed dual = new DoubleBed();
        dual.spacious();
        dual.sleepOn();
    }
}
