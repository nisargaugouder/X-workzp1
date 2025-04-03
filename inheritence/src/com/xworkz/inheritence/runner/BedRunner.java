package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.bed.Bed;
import com.xworkz.inheritence.internal.bed.KingSizeBed;

public class BedRunner {
    public static void main(String[] args) {
        Bed bed = new KingSizeBed();
        bed.sleep();
        bed.fold();
        bed.comfort();
        bed.decorate();
        bed.adjustHeight();

        System.out.println("-----------------");
        KingSizeBed kingSizeBed = new KingSizeBed();
        kingSizeBed.sleep();
        kingSizeBed.fold();
        kingSizeBed.comfort();
        kingSizeBed.decorate();
        kingSizeBed.adjustHeight();
    }
}
