package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.bed.Bed;
import com.xworkz.inheritence.internal.bed.Cotton;
import com.xworkz.inheritence.internal.bed.KingSizeBed;

public class BedRunner {
    public static void main(String[] args) {
        Bed bed1 = new Bed();
        bed1.sleep();
        bed1.fold();
        bed1.comfort();
        bed1.decorate();
        bed1.adjust();

        System.out.println("-------------------");
        Bed bed = new KingSizeBed();
        bed.sleep();
        bed.fold();
        bed.comfort();
        bed.decorate();
        bed.adjust();

        System.out.println("-----------------");
        KingSizeBed kingSizeBed = new KingSizeBed();
        kingSizeBed.sleep();
        kingSizeBed.fold();
        kingSizeBed.comfort();
        kingSizeBed.decorate();
        kingSizeBed.adjust();

        System.out.println("-----------casting");
        Cotton cotton=new Cotton();
        cotton.madeOf(bed);
        cotton.madeOf(bed1);
        cotton.madeOf(kingSizeBed);
    }
}
