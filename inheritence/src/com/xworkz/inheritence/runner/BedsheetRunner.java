package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.bedsheet.Bedsheet;
import com.xworkz.inheritence.internal.bedsheet.CottonBedsheet;

public class BedsheetRunner {
    public static void main(String[] args) {
        Bedsheet bedsheet1 = new Bedsheet();
        bedsheet1.cover();
        bedsheet1.wash();
        bedsheet1.fold();
        bedsheet1.texture();
        bedsheet1.design();

        System.out.println("-------------------");
        Bedsheet bedsheet = new CottonBedsheet();
        bedsheet.cover();
        bedsheet.wash();
        bedsheet.fold();
        bedsheet.texture();
        bedsheet.design();

        System.out.println("-----------------");
        CottonBedsheet cottonBedsheet = new CottonBedsheet();
        cottonBedsheet.cover();
        cottonBedsheet.wash();
        cottonBedsheet.fold();
        cottonBedsheet.texture();
        cottonBedsheet.design();
    }
}
